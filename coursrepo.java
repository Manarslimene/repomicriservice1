package com.example.gestioncours.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestioncours.model.Cours;

public interface coursrepo extends JpaRepository<Cours, Integer> {

}
