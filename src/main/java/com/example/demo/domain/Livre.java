package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Livre implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String auteur;

    private String description;


    public Livre() {

    }

    public Livre(Long id, String nom, String auteur, String description) {
        this.id = id;
        this.nom = nom;
        this.auteur = auteur;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", auteur='" + auteur + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}