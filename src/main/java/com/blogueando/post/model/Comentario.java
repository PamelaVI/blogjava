package com.blogueando.post.model;
import java.util.Date;

import javax.annotation.Generated;

@Entity
@Table(name="Comentario")

public class Comentario {
    private Long idusuario;
    private String nombreusuario;
    private Date fechacreacion;
    private String comentar;

    public Comentario(){

    }
    public Comentario(Long idusuario,String nombreusuario, Date fechacreacion,String comentar){
        this.idusuario=idusuario;
        this.nombreusuario=nombreusuario;
        this.fechacreacion=fechacreacion;
        this.comentar=comentar;
    }

    @idusuario
    @GeneratedValue()
}
