package com.blogueando.post.model;
import java.util.Date;

import javax.annotation.Generated;

@Entity
@Table(name="Comentario")

public class Comentario {
    private Long id;
    private String nombre;
    private Date fechacreacion;
    private String comentar;

    public Comentario(){

    }
    public Comentario(Long id,String nombre, Date fechacreacion,String comentar){
        this.id=id;
        this.nombre=nombre;
        this.fechacreacion=fechacreacion;
        this.comentar=comentar;
    }

    @Id
    @GeneratedValue()
}
