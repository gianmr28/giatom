package com.tom.giatom.controller;

import com.tom.giatom.DAO.CompraRequestDTO;
import com.tom.giatom.serviceImpl.CompraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private CompraServiceImpl compraService;

    @PostMapping
    public ResponseEntity<?> guardarCompra(@RequestBody CompraRequestDTO compra){
        return compraService.registrarCompra(compra);
    }
}
