package com.tom.giatom.controller;

import com.tom.giatom.entity.ProgresoTema;
import com.tom.giatom.serviceImpl.ProgresoTemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/progresotema")
public class ProgresoTemaController {
    @Autowired
    private ProgresoTemaServiceImpl progresoTemaService;

    @PutMapping
    public ResponseEntity<?> actualizarProgresoTema(ProgresoTema progresoTema){
        return progresoTemaService.actualizarProgresoTema(progresoTema);
    }
}
