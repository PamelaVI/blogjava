package com.blogueando.post.service;
import java.util.List;

import com.blogueando.post.repository.PostRepository;
import com.blogueando.post.repository.UsuarioRepository;
import com.blogueando.post.model.Post;
import com.blogueando.post.model.Usuario;
import org.springframework.beans.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public ArrayList<Post> listAllPost(){
        return postRepository.findAll();
    }
    public Post save(Post post){
        return postRepository.save;
    }
    public Post get(Long id){
        return postRepository.findById(id).get();
    }
    public void delete( Long id){
        return postRepository.deleteById(id);
    }
    

    
}
