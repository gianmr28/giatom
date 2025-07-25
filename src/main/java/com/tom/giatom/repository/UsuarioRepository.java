package com.tom.giatom.repository;

import com.tom.giatom.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByCorreoAndContrasena(String correo, String contrasena);
}
