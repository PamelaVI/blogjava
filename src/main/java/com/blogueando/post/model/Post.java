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

    @Column(name="fecha")
    private Date fecha;

    @Column(name="autor")
    private String autor;

    public Post(){

    }
    public Post(Long id , String titulo, String descripcion ,String contenido, Date fecha, String autor){
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.contenido=contenido;
        this.fecha=fecha;
        this.autor=autor;
    }       

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getDescripcion(){
        return descripcion;

    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(){
        this.fecha=fecha;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor=autor;
    }

        


    
}
