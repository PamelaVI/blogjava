package com.blogueando.post.model;
import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@Table(name="post")

public class Post {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;

    private  String descripcion;
    
    private String contenido;

    private Date fechacreacion;

    @JoinColumn(name="AUTOR",nullable=false)
    @ManyToOne
    private Usuario usuario;

    @OneToMany(cascade=CascadeType.ALL,mappedBy="post")
    private List<Comentario> comentarios;

    public Post(){

    }
    public Post(Long id , String titulo, String descripcion ,String contenido, Date fecha, String autor){
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.contenido=contenido;
        this.fecha=fechacreacion;
        this.autor=autor;
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
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
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
    public Date getFechacreacion(){
        return fechacreacion;
    }
    public void setFechacreacion(){
        this.fecha=fechacreacion;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor=autor;
    }
    public List <Comentario>gComentarios(){
        return comentarios == null ?null: new ArrayList<>(comentarios);
    }
    public void setComentarios(List<Comentario> comentarios) {
		if (comentarios == null) {
			this.comentarios = null;
		} else {
			this.comentarios = Collections.unmodifiableList(comentarios);
		}
	}

        


    
}
