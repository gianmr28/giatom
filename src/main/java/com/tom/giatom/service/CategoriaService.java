package com.tom.giatom.service;

import org.springframework.http.ResponseEntity;

public interface CategoriaService {
    public ResponseEntity<?> listarCategoria();
    public ResponseEntity<?> buscarCategoria(Long idcategoria);
}
