package com.tom.giatom.service;

import com.tom.giatom.entity.ProgresoTema;
import org.springframework.http.ResponseEntity;

public interface ProgresoTemaService {
    public ResponseEntity<?> actualizarProgresoTema(ProgresoTema progresoTema);
}
