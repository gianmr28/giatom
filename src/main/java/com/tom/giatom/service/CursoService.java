package com.tom.giatom.service;

import com.tom.giatom.entity.Curso;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CursoService {
    public ResponseEntity<?> listarCurso();
    public ResponseEntity<?> buscarCurso(Long idcurso);
    public ResponseEntity<?> listarCursoPorCategoria(Long idcategoria);
    public ResponseEntity<?> registrarCurso(Curso curso);
}
