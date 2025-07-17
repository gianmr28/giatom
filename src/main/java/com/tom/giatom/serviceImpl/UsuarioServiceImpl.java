package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.Usuario;
import com.tom.giatom.repository.UsuarioRepository;
import com.tom.giatom.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
