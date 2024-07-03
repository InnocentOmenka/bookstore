package com.bookstore.springbootrestfulwebservices.service;

import com.bookstore.springbootrestfulwebservices.model.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Author saveAuthor(Author author);
    List<Author> getAllAuthors();
    Author getAuthorById(Long id);
    Author updateAuthor(Long id, Author author);
    void deleteAuthor(Long id);}
