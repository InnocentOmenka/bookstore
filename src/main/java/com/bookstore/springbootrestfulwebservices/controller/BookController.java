package com.bookstore.springbootrestfulwebservices.controller;

import com.bookstore.springbootrestfulwebservices.model.entity.Book;
import com.bookstore.springbootrestfulwebservices.model.response.BookResponseDto;
import com.bookstore.springbootrestfulwebservices.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDto> createBook(@RequestBody Book book) {
        BookResponseDto savedBook = bookService.createBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDto>> getAllBooks() {
        List<BookResponseDto> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable Long id) {
        BookResponseDto book = bookService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponseDto> updateBook(@PathVariable Long id, @RequestBody Book book) {
        BookResponseDto updatedBook = bookService.updateBook(id, book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
