package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CreatePostRequest {
    @NotBlank(message = "Title is Required")
    @Size(min=3, max=100, message="Title must be between 3-100 Characters")
    private String title;

    @NotBlank(message="Content is Required")
    @Size(min=10, message = "Content must be longer than 10 Characters")
    private String content;

    @NotBlank(message = "Name of Author is Required")
    private String author;
}
