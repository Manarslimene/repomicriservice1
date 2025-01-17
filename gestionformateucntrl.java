package com.example.gestionformateur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionformateurs.model.gestionformateurs;
import com.example.gestionfornisseur.service.gestionfornisseurservice;

@RestController 
@RequestMapping
public class gestionformateucntrl {

	
	@Autowired
	private gestionfornisseurservice gestionfornisseurservice;

    @PostMapping("/save")
    public gestionformateurs saveGestionformateurs(@RequestBody gestionformateurs  gestionformateurs ) {
        return gestionfornisseurservice.savegestionfornisseurser(gestionfornisseurservice);
    }

}
