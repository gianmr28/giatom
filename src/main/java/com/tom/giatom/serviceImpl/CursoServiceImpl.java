package com.tom.giatom.serviceImpl;

import com.tom.giatom.entity.Curso;
import com.tom.giatom.repository.CursoRepository;
import com.tom.giatom.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public ResponseEntity<?> listarCurso() {
        List<Curso> lista = cursoRepository.findAll();
        if (lista.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay ningun curso");
        }
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @Override
    public ResponseEntity<?> buscarCurso(Long idcurso) {
        Optional<Curso> cursoencontrado = cursoRepository.findById(idcurso);
        if (cursoencontrado.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay ningun curso");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cursoencontrado);
    }

    @Override
    public ResponseEntity<?> listarCursoPorCategoria(Long idcategoria) {
        List<Curso> cursosPorCategoria = cursoRepository.findAllByIdcategoria(idcategoria);
        if(cursosPorCategoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay ningun curso de categoria");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cursosPorCategoria);
    }

    @Override
    public ResponseEntity<?> registrarCurso(Curso curso) {
        Curso cursoregistrado = cursoRepository.save(curso);
        if(cursoregistrado==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al registrar curso");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cursoregistrado);
    }
}
