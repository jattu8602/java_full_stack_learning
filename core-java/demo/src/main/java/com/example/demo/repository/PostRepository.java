package com.example.demo.repository;

import com.example.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    List<Post> findByAuthor(String author);
    List<Post> findByTitleContainingIgnoreCase(String keyword);

}
