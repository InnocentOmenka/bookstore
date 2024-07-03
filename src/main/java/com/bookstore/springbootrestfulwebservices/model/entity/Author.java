package com.bookstore.springbootrestfulwebservices.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Name is required")
    @Column(nullable = false, unique = true)
    private String name;
}
