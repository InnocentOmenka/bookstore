package com.bookstore.springbootrestfulwebservices.service;

import com.bookstore.springbootrestfulwebservices.model.entity.Genre;

import java.util.List;

public interface GenreService {
    Genre saveGenre(Genre genre);
    List<Genre> getAllGenres();
    Genre getGenreById(Long id);
    Genre updateGenre(Long id, Genre genre);
    void deleteGenre(Long id);
}
