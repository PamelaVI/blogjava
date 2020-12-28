package com.blogueando.post.controller;
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

import jdk.internal.net.http.Response;

import java.util.Date;
import java.util.List;

import com.blogueando.post.model.Comentario;
import com.blogueando.post.model.Post;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.service.*;
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("")
    public ArrayList<Post>list(){
        return postService.listAllPost();
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Post>add(@RequestBody Post post){
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.save(post));
    }
    @PutMapping("editar/{id}")
    public ResponseEntity<Post>update(@Validated @RequestBody Post post,@PathVariable Long id){
            return ResponseEntity.status(HttpStatus.ALTER).body(postService.save(post));
    }
    @PostMapping("/{id}/comentario")
    public ResponseEntity<?>crearComentario(@PathVariable Long id,@RequestBody Comentario comentario){
        Post post = PostRepository.getOne(id);
        Usuario usuario = usuarioRepository.getOne(comentario.getId());
        Comentario comentar = new Comentario();
        comentario.setComentario(comentario.getComentario());
        comentario.setAutor(usuario.getEmail());
        comentario.setFechacreacion(Date.now());
        post.addComentario(comentario);
        return ResponseEntity.status(HttpStatus.CREATED).body(comentarioService.savecomentario(comentario));
        
    }
    
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id){
        postService.delete(id);
    }
}
