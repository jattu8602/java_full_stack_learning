package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Table(name ="comments")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder


public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(nullable=false)
    private String author;

    @Column(nullable=false, columnDefinition="TEXT")
    private String body;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="post_id",nullable=false)
    private Post post;

    @Column(name="created_at", updatable=false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }



}
