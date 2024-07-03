package com.bookstore.springbootrestfulwebservices.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookResponseDto {
    private Long id;
    private String title;
    private String description;
    private String authorName;
    private String genreName;
}
