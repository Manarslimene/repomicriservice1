package com.example.gestionformateurs.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class gestionformateurs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id ;
	private String nom ;
	private String prenom ;
	private String specalite ;
    private int anneeexperience ;
    private Date daterecreutement ;
    private String statut ;
	
}
