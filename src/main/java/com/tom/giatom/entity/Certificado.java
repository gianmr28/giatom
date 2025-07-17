package com.tom.giatom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "certificado")
@AllArgsConstructor
@NoArgsConstructor
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcertificado;
    private int idusuario;
    private int idcurso;
    private Date fecha;
    private String codigo;
}
