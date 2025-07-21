package com.tom.giatom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "progreso")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Progreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprogreso;
    private int idcurso;
    private int idusuario;
    private BigDecimal porcentaje;
    private Date fecha;
}
