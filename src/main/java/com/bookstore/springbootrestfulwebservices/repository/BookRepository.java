package com.bookstore.springbootrestfulwebservices.repository;

import com.bookstore.springbootrestfulwebservices.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
