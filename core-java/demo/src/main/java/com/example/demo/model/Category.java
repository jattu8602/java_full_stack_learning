package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name="categories")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder



public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @ManyToMany(mappedBy="categories")
    private Set<Post> posts = new HashSet<>();


}
