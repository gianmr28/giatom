package com.tom.giatom.serviceImpl;

import com.tom.giatom.DAO.CompraRequestDTO;
import com.tom.giatom.DAO.DetalleCompraDTO;
import com.tom.giatom.entity.Compra;
import com.tom.giatom.entity.DetalleCompra;
import com.tom.giatom.entity.ProgresoTema;
import com.tom.giatom.entity.Tema;
import com.tom.giatom.repository.CompraRepository;
import com.tom.giatom.repository.DetalleCompraRepository;
import com.tom.giatom.repository.ProgresoTemaRepository;
import com.tom.giatom.repository.TemaRepository;
import com.tom.giatom.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;
    @Autowired
    private TemaRepository temaRepository;
    @Autowired
    private ProgresoTemaRepository progresoTemaRepository;
    @Autowired
    private DetalleCompraRepository detalleCompraRepository;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date fechaSoloFecha = sdf.parse(sdf.format(new Date()));

    public CompraServiceImpl() throws ParseException {
    }

    @Override
    public ResponseEntity<?> registrarCompra(CompraRequestDTO compra) {
        if(compra==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Compra esta vacia");
        }
        if(compra.getDetalle().isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Detalle compra esta vacia");
        }

        Compra nuevaCompra = new Compra();
        nuevaCompra.setIdusuario(compra.getIdusuario());
        nuevaCompra.setFecha(fechaSoloFecha);

        Compra compraGuardada = compraRepository.save(nuevaCompra);
        int idcompra = compraGuardada.getIdcompra();

        List<DetalleCompra> listaDetalleCompraReal = new ArrayList<>();

        for(DetalleCompraDTO c : compra.getDetalle()){
            DetalleCompra detalleCompra = new DetalleCompra();
            detalleCompra.setIdcompra(idcompra);
            detalleCompra.setPrecio(c.getPrecio());
            detalleCompra.setIdcurso(c.getIdcurso());
            listaDetalleCompraReal.add(detalleCompra);
        }

        detalleCompraRepository.saveAll(listaDetalleCompraReal);

        List<Tema> temasComprados = new ArrayList<>();

        for(DetalleCompraDTO d : compra.getDetalle()){
            Long idCursoLong = d.getIdcurso().longValue();
            List<Tema> temasbuscados = temaRepository.findAllByIdcurso(idCursoLong);
            temasComprados.addAll(temasbuscados);
        }

        List<ProgresoTema> progresoTemasAnadir = new ArrayList<>();

        for (Tema t : temasComprados){
            ProgresoTema progresoTema = new ProgresoTema(null, t.getIdtema(), compra.getIdusuario(), "n", fechaSoloFecha, null);
            progresoTemasAnadir.add(progresoTema);
        }

        progresoTemaRepository.saveAll(progresoTemasAnadir);

        return ResponseEntity.status(HttpStatus.OK).body(compraGuardada);
    }
}
