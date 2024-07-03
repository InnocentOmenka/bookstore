package com.bookstore.springbootrestfulwebservices.controller;

import com.bookstore.springbootrestfulwebservices.model.entity.Genre;
import com.bookstore.springbootrestfulwebservices.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/genre")
public class GenreController {

    private final GenreService genreService;

    @PostMapping
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre) {
        Genre savedGenre = genreService.saveGenre(genre);
        return new ResponseEntity<>(savedGenre, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Genre>> getAllGenres() {
        List<Genre> genres = genreService.getAllGenres();
        return new ResponseEntity<>(genres, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable Long id) {
        Genre genre = genreService.getGenreById(id);
        return new ResponseEntity<>(genre, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(@PathVariable Long id, @RequestBody Genre genre) {
        Genre updatedGenre = genreService.updateGenre(id, genre);
        return new ResponseEntity<>(updatedGenre, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenre(@PathVariable Long id) {
        genreService.deleteGenre(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
