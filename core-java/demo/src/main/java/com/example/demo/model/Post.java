package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.*;


@Entity
@Table(name="posts")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder

public class Post{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false, columnDefinition="TEXT")
    private String content;

    private String author;

    @Column(name="created_at", updatable=false)
    private LocalDateTime createdAt;

    @Column(name= "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt= LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate(){
        updatedAt = LocalDateTime.now();
    }

    @OneToMany(mappedBy="post",cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Comment> comments= new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name="post_categories",
            joinColumns=@JoinColumn(name="post_id"),
            inverseJoinColumns=@JoinColumn(name="category_id")

    )
    private Set<Category> categories = new HashSet<>();







}

