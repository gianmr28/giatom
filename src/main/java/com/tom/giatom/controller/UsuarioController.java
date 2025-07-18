package com.tom.giatom.controller;

import com.tom.giatom.DAO.UsuarioLogin;
import com.tom.giatom.entity.Usuario;
import com.tom.giatom.serviceImpl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario){
        return usuarioService.registrarUsuario(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUsuario(@RequestBody UsuarioLogin usuarioLogin) {
        return usuarioService.loginUsuario(usuarioLogin.getCorreo(), usuarioLogin.getContrasena());
    }
}
