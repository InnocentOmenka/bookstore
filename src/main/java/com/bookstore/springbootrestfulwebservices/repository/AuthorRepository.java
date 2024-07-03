package com.bookstore.springbootrestfulwebservices.repository;

import com.bookstore.springbootrestfulwebservices.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
