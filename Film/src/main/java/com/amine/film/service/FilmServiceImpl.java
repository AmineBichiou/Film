package com.amine.film.service;

import com.amine.film.entities.Film;
import com.amine.film.repos.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    FilmRepository FilmRepository;
    @Override
    public Film saveFilm(Film f) {

        return FilmRepository.save(f);
    }

    @Override
    public Film updateFilm(Film f) {
        return FilmRepository.save(f);
    }

    @Override
    public void deleteFilm(Film f) {
        FilmRepository.delete(f);

    }

    @Override
    public void deleteFilmById(Long id) {
        FilmRepository.deleteById(id);

    }

    @Override
    public Film getFilm(Long id) {
        return FilmRepository.findById(id).get();
    }

    @Override
    public List<Film> getAllFilm() {
        return FilmRepository.findAll();
    }
    public Page<Film> getAllFilmsParPage(int page, int size) {
        return FilmRepository.findAll(PageRequest.of(page, size));
    }
}
