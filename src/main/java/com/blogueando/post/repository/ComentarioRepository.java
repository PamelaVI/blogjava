package com.blogueando.post.repository;
import java.util.List;
import com.blogueando.post.model.Comentario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Query.Param;

public class ComentarioRepository extends JpaRepository<Comentario,Long>{

    @Query(nativeQuery=true,value ="select *from Comentarios s Order By s.fechacreacion desc LIMIT ?1")
List<Comentario>getComentariosPorLimite(@Param("limit")Integer limit)
}
