package com.tom.giatom.controller;

import com.tom.giatom.serviceImpl.TemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tema")
public class TemaController {
    @Autowired
    private TemaServiceImpl temaService;

    @GetMapping("/listar/{idcurso}")
    public ResponseEntity<?> listarTemaPorIdcurso(@PathVariable Long idcurso){
        return temaService.ListarTemaPorIdcurso(idcurso);
    }
}
