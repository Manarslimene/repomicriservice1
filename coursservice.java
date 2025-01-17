package com.example.gestioncours.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestioncours.model.Cours;
import com.example.gestioncours.repo.coursrepo;

public class coursservice {

	
	
	@Autowired
	private coursrepo coursrepo ;
	
	
	public Cours save (Cours cours ) {
		return coursrepo.save(cours);

}

	  public void deleteById(Long id) {
	        if (coursrepo.existsById(id)) {
	            coursrepo.deleteById(id);
	        } else {
	            throw new IllegalArgumentException("Cours avec l'ID " + id + " n'existe pas.");
	        }
	    }
	
}
