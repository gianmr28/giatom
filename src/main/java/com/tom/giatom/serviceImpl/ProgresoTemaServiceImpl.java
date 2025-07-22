package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.ProgresoTema;
import com.tom.giatom.repository.ProgresoTemaRepository;
import com.tom.giatom.service.ProgresoTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProgresoTemaServiceImpl implements ProgresoTemaService{
    @Autowired
    private ProgresoTemaRepository progresoTemaRepository;

    @Override
    public ResponseEntity<?> actualizarProgresoTema(ProgresoTema progresoTema) {
        ProgresoTema progresoTemaUpdate = progresoTemaRepository.save(progresoTema);
        if(progresoTemaUpdate==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se actualizo correctamente el progreso");
        }
        return ResponseEntity.status(HttpStatus.OK).body(progresoTemaUpdate);
    }
}
