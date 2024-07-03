package com.bookstore.springbootrestfulwebservices.repository;

import com.bookstore.springbootrestfulwebservices.model.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
