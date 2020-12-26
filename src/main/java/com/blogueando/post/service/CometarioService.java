import java.util.ArrayList;
import java.util.List;
import com.blogueando.post.model.Usuario;
import com.blogueando.post.model.Comentario;
import com.blogueando.post.model.Post;
import com.blogueando.post.controller.UsuarioController;
import com.blogueando.post.controller.PostController;
import com.blogueando.post.controller.ComentarioController;
import com.blogueando.post.repository.ComentarioRepository;
import com.blogueando.post.repository.UsuarioRepository;
import com.blogueando.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CometarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;

    public ArrayList<Comentario> listAllComentario(){
        return comentarioRepository.findAll();
    }
    public Comentario save(Comentario comentario){
        return comentarioRepository.save;
    }
    public Comentario get(Long id){
        return comentarioRepository.findById(id).get();
    }
    public void delete( Long id){
        return comentarioRepository.deleteById(id);
    }
    
}
