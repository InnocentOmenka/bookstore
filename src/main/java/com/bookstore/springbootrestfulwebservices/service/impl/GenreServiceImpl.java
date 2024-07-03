package com.bookstore.springbootrestfulwebservices.service.impl;

import com.bookstore.springbootrestfulwebservices.exception.ResourceNotFoundException;
import com.bookstore.springbootrestfulwebservices.model.entity.Genre;
import com.bookstore.springbootrestfulwebservices.repository.GenreRepository;
import com.bookstore.springbootrestfulwebservices.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;
    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre getGenreById(Long id) {
        return genreRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Genre not found with ID: " + id));
    }

    @Override
    public Genre updateGenre(Long id, Genre genre) {
        if (genreRepository.existsById(id)) {
            genre.setId(id);
            return genreRepository.save(genre);
        } else {
            throw new ResourceNotFoundException("Genre not found with ID: " + id);
        }
    }

    @Override
    public void deleteGenre(Long id) {
        if (genreRepository.existsById(id)) {
            genreRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Genre not found with ID: " + id);
        }
    }
}
