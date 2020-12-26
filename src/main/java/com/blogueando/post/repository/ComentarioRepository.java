package com.blogueando.post.repository;
import java.util.List;
import com.blogueando.post.model.Comentario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Query.Param;

public interface ComentarioRepository extends JpaRepository<Comentario,Long>{

  
}
