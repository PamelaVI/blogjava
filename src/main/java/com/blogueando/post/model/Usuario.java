package com.blogueando.post.model;
import java.util.Date;
import java.util.List;
import java.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import javax.validation.*;
import org.springframework.web.bin.annotation;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name="Usuario")
public class Usuario  implements Serializable{
    @Id
    @GeneratedValues(strategy=GeneratedType.AUTO)
    private Long id;
    
    @Column(name="nombre")
    private String nombreusuario;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email" ,unique=true)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="fechacreacion")
    private Date fechacreacion;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="provincia")
    private String provincia;
    
    @Column(name="pais")
    private String pais;

    @OneToMany(mappedBy= "usuario",fetch=FetchType.Lazy,cascade= CascadeType.ALL)
    private List<Post>post;
    public List<Post> getPost(){
        return post;
    }
    public void setPost(List<Post>post){
        this.post=post;
    }
    public void addPost( Post post){
        this.post.add(post);
        post.setUsuario(this);
    }

    public Usuario(){

    }

    public Usuario(Long id, String nombre,String apellido, String email, String ciudad , String provincia, String pais){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.password="";
        this.fechacreacion=" ";
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.pais=pais;
        
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Date getFechacreacion(){
        return fechacreacion;
    }
    public void setFechacreacion( Date fechacreacion){
        this.fechacreacion=fechacreacion;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getProvincia(){
        return provincia;
    }
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais=pais;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id+ ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
                + ", fechacreacion=" + fechacreacion +", ciudad="+ ciudad +",provincia="+provincia+",pais="+pais + "]";
    }
          



    
}
