package com.tom.giatom.service;

import com.tom.giatom.entity.Usuario;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {
    public ResponseEntity<Usuario> registrarUsuario(Usuario usuario);
    public ResponseEntity<?> loginUsuario(String correo, String contrasena);
}
