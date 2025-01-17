package com.example.gestioncours.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestioncours.model.Cours;
import com.example.gestioncours.service.coursservice;

@RestController
@RequestMapping
public class courscntrl {
	
	@Autowired
	
	private coursservice coursservice;

	@PostMapping("/save")
	public Cours saveCours(@RequestBody Cours cours) {
	    return coursservice.saveCours(cours);
	}
	
	
	@PostMapping("/delete")
	public String deleteCours(@RequestBody Long coursId) {
	    coursservice.deleteCours(coursId); 
	    return "Cours supprimé avec succès ";
	}
}
