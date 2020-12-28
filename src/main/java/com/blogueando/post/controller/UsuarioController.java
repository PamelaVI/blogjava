package com.blogueando.post.controller;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.service.UsuarioService;

import java.util.List;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jdk.internal.net.http.Response;




@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {
    @Autowired
    private   UsuarioService usuarioService;
    @Autowired 
    private PostService postService;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }
    @GetMapping("/Usuario")
    public List<Usuario>getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }
    @GetMapping("/Usuario/{id}")
    public ResponseEntity<Usuario>getUsuario(@PathVariable(value ="id")Long id){
        Usuario usuario=usuarioService.getUsuario(id);
        return ResponseEntity.ok().body(usuario);

    }
    
    
    @PostMapping("/Usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario createUsuario(@RequestBody Usuario usuario) {
            return usuarioService.createUsuario(usuario);
        }
        
    
  
    @PutMapping("/Usuario/{id}/Actualizar")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable(value="id") Long id,@RequestBody Usuario usuario){
        Usuario =usuarioService.updateUsuario(id);
        return ResponseEntity.ok(usuario);
    }
       

    
    @DeleteMapping("/Usuario/{id}/eliminar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuarioById(@PathVariable(value= "id") Long id){
        usuarioService.deleteUsuario(id);
    }
        
       
}
    

