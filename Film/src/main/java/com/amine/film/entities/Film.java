package com.amine.film.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilm;
    private String nomFilm;
    private Double rateFilm;
    private Date dateCreation;


    public Film() {
        super();
    }

    public Film(String nomFilm, Double rateFilm, Date dateCreation) {
        super();
        this.nomFilm = nomFilm;
        this.rateFilm = rateFilm;
        this.dateCreation = dateCreation;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public double getRateFilm() {
        return rateFilm;
    }

    public void setRateFilm(Double rateFilm) {
        this.rateFilm = rateFilm;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", rateFilm=" + rateFilm + ", DateCreation="
                + dateCreation + "]";
    }
}