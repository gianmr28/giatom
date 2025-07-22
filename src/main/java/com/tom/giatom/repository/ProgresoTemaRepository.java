package com.tom.giatom.repository;

import com.tom.giatom.entity.ProgresoTema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgresoTemaRepository extends JpaRepository<ProgresoTema, Long> {
}
