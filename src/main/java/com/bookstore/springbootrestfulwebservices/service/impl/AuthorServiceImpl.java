package com.bookstore.springbootrestfulwebservices.service.impl;

import com.bookstore.springbootrestfulwebservices.exception.ResourceNotFoundException;
import com.bookstore.springbootrestfulwebservices.model.entity.Author;
import com.bookstore.springbootrestfulwebservices.repository.AuthorRepository;
import com.bookstore.springbootrestfulwebservices.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author not found with ID: " + id));
    }

    @Override
    public Author updateAuthor(Long id, Author author) {
        if (authorRepository.existsById(id)) {
            author.setId(id);
            return authorRepository.save(author);
        } else {
            throw new ResourceNotFoundException("Author not found with ID: " + id);
        }
    }

    @Override
    public void deleteAuthor(Long id) {
        if (authorRepository.existsById(id)) {
            authorRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Author not found with ID: " + id);
        }
    }
}
