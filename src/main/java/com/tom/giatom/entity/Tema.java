package com.tom.giatom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tema")
@AllArgsConstructor
@NoArgsConstructor
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtema;
    private int idcurso;
    private String nombre;
    private String descripcion;
    private String video;
}
