package com.blogueando.post.repository;
import com.blogueando.post.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    }
