package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.Categoria;
import com.tom.giatom.repository.CategoriaRepository;
import com.tom.giatom.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public ResponseEntity<?> listarCategoria() {
        List<Categoria> listaCategoria= categoriaRepository.findAll();
        if (listaCategoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay ninguna categoria");
        }
        return ResponseEntity.status(HttpStatus.OK).body(listaCategoria);
    }

    @Override
    public ResponseEntity<?> buscarCategoria(Long idcategoria) {
        Optional<Categoria> categoria=categoriaRepository.findById(idcategoria);
        if (categoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay ninguna categoria");
        }
        return ResponseEntity.status(HttpStatus.OK).body(categoria);
    }
}
