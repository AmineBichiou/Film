package com.amine.film.service;

import com.amine.film.entities.Film;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FilmService {
    Film saveFilm(Film f);
    Film updateFilm(Film f);
    void deleteFilm(Film f);
    void deleteFilmById(Long id);
    Film getFilm(Long id);
    List<Film> getAllFilm();
    Page<Film> getAllFilmsParPage(int page, int size);
}
