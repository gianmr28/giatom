package com.tom.giatom.service;

import com.tom.giatom.DAO.CompraRequestDTO;
import org.springframework.http.ResponseEntity;

public interface CompraService {
    public ResponseEntity<?> registrarCompra(CompraRequestDTO compra);
}
