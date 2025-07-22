package com.tom.giatom.repository;

import com.tom.giatom.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
    public List<Tema> findAllByIdcurso(Long idcurso);
}
