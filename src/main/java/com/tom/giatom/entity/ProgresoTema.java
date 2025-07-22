package com.tom.giatom.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "progresotema")
public class ProgresoTema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprogresotema;
    private int idtema;
    private int idusuario;
    private String completado;
    private Date fechaupdate;
    private BigDecimal porcentaje;
}
