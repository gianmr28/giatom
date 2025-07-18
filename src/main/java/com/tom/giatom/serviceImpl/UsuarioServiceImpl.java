package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.Usuario;
import com.tom.giatom.repository.UsuarioRepository;
import com.tom.giatom.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public ResponseEntity<Usuario> registrarUsuario(Usuario usuario) {
       Usuario nuevoUsuario = usuarioRepository.save(usuario);
       return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

    @Override
    public ResponseEntity<?> loginUsuario(String correo, String contrasena) {
        Usuario usuario = usuarioRepository.findByCorreoAndContrasena(correo, contrasena);
        if (usuario==null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales no validas");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }
}
