package com.tom.giatom.service;

import org.springframework.http.ResponseEntity;

public interface TemaService {
    public ResponseEntity<?> ListarTemaPorIdcurso(Long idcurso);
}
