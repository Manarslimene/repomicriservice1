package com.example.gestionformateurservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionformateurs.model.gestionformateurs;

@RestController
@RequestMapping
public class gestionformateurservice {

	@Autowired
    private gestionformateurservice  gestionformateurservice;

    @PostMapping("/save")
    public gestionformateurs savegestionformateurs(@RequestBody gestionformateurs  gestionformateurs ) {
        return gestionformateurservice.savegestionformateurs(gestionformateurs);
    }

    
	
	
}
