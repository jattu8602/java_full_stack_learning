package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CreateCommentRequest {
    @NotBlank(message = "Author is Required")
    private String author;

    @NotBlank(message = "Message is Required")
    private String body;


}
