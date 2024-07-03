package com.bookstore.springbootrestfulwebservices.service;

import com.bookstore.springbootrestfulwebservices.model.entity.Book;
import com.bookstore.springbootrestfulwebservices.model.response.BookResponseDto;

import java.util.List;

public interface BookService {
    BookResponseDto createBook(Book book);
    List<BookResponseDto> getAllBooks();
    BookResponseDto getBookById(Long id);
    BookResponseDto updateBook(Long id, Book book);
    void deleteBook(Long id);
}
