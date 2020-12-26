package com.blogueando.post.service;
import com.blogueando.post.repository.UsuarioRepository;
import com.blogueando.post.model.Usuario;
import org.springframework.beans.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
  @Autowired 
  private UsuarioRepository usuarioRepository;
  
  public List<Usuario>listAllUsuario(){
    return usuarioRepository.findAll();
  }

  public void save(Long id){
    usuarioRepository.save(usuario);
  }
  public Usuario get(Long id){
    return usuarioRepository.findById(id).get();
  }
  
  public void delete(Long id){
    usuarioRepository.deleteById(id);
  }

  
  
}
