package com.example.demo.dao;

import com.example.demo.domain.Livre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface LivreRepository extends CrudRepository<Livre, Long> {
    Livre findByNom(String nom);
    List<Livre> findByAuteur(String auteur);
}
