package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "livre")
public class Livre implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String auteur;

    private String description;

    private boolean isEmprunt;


    public Livre() {

    }

    public Livre(Long id, String nom, String auteur, String description, boolean isEmprunt) {
        this.id = id;
        this.nom = nom;
        this.auteur = auteur;
        this.description = description;
        this.isEmprunt = isEmprunt;
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

    public boolean getIsEmprunt(){
        return isEmprunt;
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
