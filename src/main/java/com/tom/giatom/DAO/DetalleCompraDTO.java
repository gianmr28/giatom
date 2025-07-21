package com.tom.giatom.DAO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleCompraDTO {
    private Integer idcurso;
    private BigDecimal precio;
}
