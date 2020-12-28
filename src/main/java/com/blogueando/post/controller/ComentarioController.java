package com.blogueando.post.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.valid;
import java.util.HashMap;
import java.util.Map;
import com.blogueando.post.model.Comentario;
import com.blogueando.post.model.Post;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.service.ComentarioService;
import com.blogueando.post.repository.UsuarioRepository;
import com.blogueando.post.repository.ComentarioRepository;


@RestController
@RequestMapping("/api/v1/comentario")
public class ComentarioController {
    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
     private UsuarioRepository usuarioRepository;

    @GetMapping("/comentario/mostrar/{id}")
    public List<Comentario> list(){
        return comentarioService.listAllComentario();
    
    }
    @PostMapping("/nuevo")
    public ResponseEntity<Comentario>add(@RequestBody Comentario comentario){
        return ResponseEntity.status(HttpStatus.CREATED).body(comentarioService.save(comentario));
    }
    @PutMapping("editar/{id}")
    public Comentario update(Comentario comentario,@PathVariable Long id){
        return null;
    }
    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable Long id){
        comentarioService.delete(id);
    }



}
