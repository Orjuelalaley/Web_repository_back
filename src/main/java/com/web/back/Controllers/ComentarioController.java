package com.web.back.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/comentario")
public class ComentarioController {

    /*private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }
    @GetMapping("/all")
    public ResponseEntity<?> obtenerTodosLosComentarios() {
        List<Comentario> comentarios = comentarioService.listAll();
        return ResponseEntity.status(HttpStatus.OK).body(comentarios);
    }


    @PostMapping("/")
    public Comentario createComentario(@RequestBody Comentario comentario) {
        return comentarioService.guardarComentario(comentario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comentario> updateComentario(@PathVariable int id,@RequestBody Comentario comentario) throws ComentarioNotFoundException {
        comentario.setId(id);
        Comentario updatedComentario = comentarioService.actualizarComentario(comentario);
        return ResponseEntity.ok(updatedComentario);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteComentario(@PathVariable int id)
            throws ComentarioNotFoundException {
        comentarioService.eliminarComentario(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }*/
}