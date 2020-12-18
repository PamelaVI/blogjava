package com.blogueando.post.repository;
import java.util.List;
import com.blogueando.post.model.Usuario;
import org.springframework.beans.annotation.Autowired;
import org.springframework.stereotype.Repository;
 import com.blogueando.post.usuario.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
    UsuarioModel findByEmail(String nombre);
    List <Usuario>findAllByCiudad( String ciudad);
    List <Usuario> findUsuarioByFechaCreacion(LocalDate fechacreacion);
    Optional <Usuario>findById(Long id);

    
}

