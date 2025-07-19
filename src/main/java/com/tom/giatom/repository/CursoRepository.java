package com.tom.giatom.repository;

import com.tom.giatom.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    public List<Curso> findAllByIdcategoria(Long idcategoria);
}
