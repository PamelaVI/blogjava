package com.blogueando.post.controller;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.repository.UsuaioRepository;
import com.blogueando.post.repository.UsuarioRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class UsuarioController {
    private  final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }
    @GetMapping("/Usuario")
    public String showUsuario(Usuario usuario){
        return "NuevoUsuario";
    }
    @GetMapping("/Registrar")
    public String  showResgistarForm(Usuario usuario){
        return "agregar-usuario";
    }
    @PostMapping("/agregarusuario")
    public String agregarUsuario(@Valid Usuario usuario,BindingResult result,Model model) {
        if (result.hasErrors()){
            return "agregar-usuario";
        }
        usuarioRepository.save(usuario);
        model.addAttribute("usuario",usuarioRepository.findAll());
        return "index";
    }
    @GetMapping("/editar/{}")
    public String showActualizarForm(@PathVariable("idusuario")Long id, Model model){
        Usuario usuario= usuarioRepository.findByld(id).orElseThrow(()->new IllegalArgumentException("Usuario invalido:"+id));
        model.addAttribute("usuario",usuario);
        return "actualizar-usuario";
    }
    @PostMapping("/Actualizar/{id}")
    public String actualizarUsuario(@PathVariable("id") Long id,@Valid usuario, BindingResult result, Model model){
        if (result.hasErrors()){
            usuario.setId(id);
            return "actualizar-usuario";
        }
        usuarioRepository.save(usuario);
        model.addAttribute("usuario", usuarioRepository.findAll());
        return"index";

    }
    @GetMapping("/eliminar/{id}")
    public  String eliminarUsuario(@PathVariable("id") Long id, Model model){
        Usuario usuario= usuarioRepository.findByld(id).orElseThrow(()-> new IllegalArgumentException("usuario invalido:"+id));
        usuarioRepository.delete(Usuario);
        model.addAttribute("usuario",usuarioRepository.findAll());
        return "index";
        
    }
        
       
}
    

