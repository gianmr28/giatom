package com.tom.giatom.controller;

import com.tom.giatom.DAO.UsuarioLoginDTO;
import com.tom.giatom.entity.Usuario;
import com.tom.giatom.serviceImpl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<?> loginUsuario(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        return usuarioService.loginUsuario(usuarioLoginDTO.getCorreo(), usuarioLoginDTO.getContrasena());
    }
}
