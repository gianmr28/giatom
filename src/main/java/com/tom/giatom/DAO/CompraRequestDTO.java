package com.tom.giatom.DAO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraRequestDTO {
    private Integer idusuario;
    private List<DetalleCompraDTO> detalle;
}
