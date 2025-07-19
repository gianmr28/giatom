package com.tom.giatom.controller;

import com.tom.giatom.serviceImpl.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaServiceImpl categoriaService;

    @GetMapping("/listar")
    public ResponseEntity<?> listarCategoria(){
        return categoriaService.listarCategoria();
    }

    @GetMapping("/buscar/{idcategoria}")
    public ResponseEntity<?> buscarCategoria(@PathVariable Long idcategoria){
        return categoriaService.buscarCategoria(idcategoria);
    }
}
