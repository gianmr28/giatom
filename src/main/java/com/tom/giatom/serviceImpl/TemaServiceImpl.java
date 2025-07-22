package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.Tema;
import com.tom.giatom.repository.TemaRepository;
import com.tom.giatom.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaServiceImpl implements TemaService {
    @Autowired
    private TemaRepository temaRepository;

    @Override
    public ResponseEntity<?> ListarTemaPorIdcurso(Long idcurso) {
        List<Tema> listaTemas = temaRepository.findAllByIdcurso(idcurso);
        if(listaTemas.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay temas segun idcurso");
        }
        return ResponseEntity.status(HttpStatus.OK).body(listaTemas);
    }
}
