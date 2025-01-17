package com.example.gestioncours.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cours {

	@Id
	@GeneratedValue
	private int id;
    private String titre;
    private String description;
    private String niveau ;
    private int duree ;
    private double prix ;
    
}
