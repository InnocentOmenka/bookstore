package com.bookstore.springbootrestfulwebservices.service.impl;

import com.bookstore.springbootrestfulwebservices.exception.ResourceNotFoundException;
import com.bookstore.springbootrestfulwebservices.model.entity.Author;
import com.bookstore.springbootrestfulwebservices.model.entity.Book;
import com.bookstore.springbootrestfulwebservices.model.entity.Genre;
import com.bookstore.springbootrestfulwebservices.model.response.BookResponseDto;
import com.bookstore.springbootrestfulwebservices.repository.AuthorRepository;
import com.bookstore.springbootrestfulwebservices.repository.BookRepository;
import com.bookstore.springbootrestfulwebservices.repository.GenreRepository;
import com.bookstore.springbootrestfulwebservices.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;


    @Override
    public BookResponseDto createBook(Book book) {
        return getBookResponseDto(book, book);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public BookResponseDto getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with ID: " + id));
        return mapToDTO(book);
    }

    @Override
    public BookResponseDto updateBook(Long id, Book book) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with ID: " + id));

        existingBook.setTitle(book.getTitle());
        existingBook.setDescription(book.getDescription());

        return getBookResponseDto(book, existingBook);
    }

    private BookResponseDto getBookResponseDto(Book book, Book existingBook) {
        Author author = authorRepository.findById(book.getAuthor().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Author ID: " + book.getAuthor().getId()));
        Genre genre = genreRepository.findById(book.getGenre().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Genre ID: " + book.getGenre().getId()));

        existingBook.setAuthor(author);
        existingBook.setGenre(genre);

        Book savedBook = bookRepository.save(existingBook);
        return mapToDTO(savedBook);
    }

    @Override
    public void deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Book not found with ID: " + id);
        }
    }

    private BookResponseDto mapToDTO(Book book) {
        return new BookResponseDto(
                book.getId(),
                book.getTitle(),
                book.getDescription(),
                book.getAuthor().getName(),
                book.getGenre().getName()
        );
    }
}
