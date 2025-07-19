package com.tom.giatom.controller;

import com.tom.giatom.entity.Curso;
import com.tom.giatom.entity.Usuario;
import com.tom.giatom.serviceImpl.CursoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoServiceImpl cursoService;

    @GetMapping("/listar")
    public ResponseEntity<?> listarCurso(){
        return cursoService.listarCurso();
    }
    @GetMapping("/buscar/{idcurso}")
    public ResponseEntity<?> buscarCurso(@PathVariable Long idcurso){
        return cursoService.buscarCurso(idcurso);
    }
    @GetMapping("/buscar/categoria/{idcategoria}")
    public ResponseEntity<?> buscarCursoPorCategoria(@PathVariable Long idcategoria){
        return cursoService.listarCursoPorCategoria(idcategoria);
    }
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarCurso(@RequestBody Curso curso){
        return cursoService.registrarCurso(curso);
    }

}
