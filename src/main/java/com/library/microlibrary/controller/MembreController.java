package com.library.microlibrary.controller;

import com.library.microlibrary.dao.MembreDao;


import com.library.microlibrary.exceptions.MembreIntrouvableException;
import com.library.microlibrary.model.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class MembreController {

    @Autowired
    private MembreDao membreDao;


   //Membres
    @GetMapping(value = "Membres")
    public List<Membre> listeMembres(){

        return membreDao.findAll();

    }


    @PostMapping(value = "/Membres")
    public ResponseEntity<Void> ajouterMembre(@Valid @RequestBody Membre membre) {

        Membre membre1 = membreDao.save(membre);

        if (membre == null){

            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(membre1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    //Livres/{id}
    @GetMapping(value= "Membres/{id}")
    public Membre afficherUnMembre(@PathVariable int id) throws MembreIntrouvableException {

        Membre membre = membreDao.findById(id);

        if(membre == null) throw new MembreIntrouvableException("Le membre avec l'id " + id + " n'existe pas");

        return membre;

    }

    @PutMapping (value = "/Membres")
    public void updateMembre(@RequestBody Membre membre) {

        membreDao.save(membre);
    }

}
