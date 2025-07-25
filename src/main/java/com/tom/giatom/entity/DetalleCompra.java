package com.tom.giatom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "detallecompra")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddetalle;
    private int idcompra;
    private int idcurso;
    private BigDecimal precio;
}
