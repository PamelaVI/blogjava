package com.blogueando.post.model;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@Table(name="Post")
public class Post {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="titulo")
    private String titulo;

    @Column(name="descripcion")
    private  String descripcion;
    
    @Column(name="contenido")
    private String contenido;

    @Column(name="fechacreacion")
    private Date fechacreacion;

    @Column(name="nombre")
    private String nombre;

    public Post(){

    }
    public Post(Long id , String titulo, String descripcion ,String contenido, Date fechacreacion, String nombre){
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.contenido=contenido;
        this.fechacreacion=fechacreacion;
        this.nombre=nombre;
    }       
        


    
}
