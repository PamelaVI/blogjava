package com.blogueando.post.model;
import java.util.Date;


import javax.annotation.Generated;

@Entity
@Table(name="Comentario")

public class Comentario {
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    
    private Long id;
    private String nombre;
    private Date fechacreacion;
    private String comentar;
    @JoinColumn(name="Autor",nullable=false)
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name= "FK_POST",nullable=false)
    Usuario Post;

    public Comentario(){

    }
    public Comentario(Long id,String nombre, Date fechacreacion,String comentar){
        this.id=id;
        this.nombre=nombre;
        this.fechacreacion=fechacreacion;
        this.comentar=comentar;
    }
    public Date getFechacreacion(){
        return fechacreacion;
    }
    public void setFechacreacion(Date fechacreacion){
        this.fechacreacion=fechacreacion;
    }
    public String getComentar(){
        return comentar;
    }
    public void setComentar(String comentar){
        this.comentar=comentar;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario( Usuario usuario){
        this.usuario=usuario;
    }
    public Post getPost(){
        return post;
    }
    public void setPost(Post post){
        this.post=post;
    }

   

}
