package com.blogueando.post.controller;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.service.UsuarioService;

import java.util.List;

import javax.validation.Valid;
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
@RequestMapping("api/")
public class UsuarioController {
    @Autowired
    private  final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }
    @GetMapping("/Usuarios")
    public List<Usuario>getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario>getUsuario(@PathVariable(value ="id")Long id){
        Usuario usuario=usuarioService.getUsuario(id);
        return ResponseEntity.ok().body(usuario);

    }
    
    
    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario createUsuario(@RequestBody Usuario usuario) {
            return usuarioService.createUsuario(usuario);
        }
        
    
  
    @PutMapping("/usuarios/{id}/Actualizar")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable(value="id") Long id,@RequestBody Usuario){
        Usuario usuario=usuarioService.updateUsuario(id);
        return ResponseEntity.ok(usuario);
    }
       

    
    @DeleteMapping("/usuarios/{id}/eliminar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuarioById(@PathVariable(value= "id") Long id){
        usuarioService.deleteUsuario(id);
    }
        
       
}
    

