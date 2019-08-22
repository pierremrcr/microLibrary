package com.library.microlibrary.controller;

import com.library.microlibrary.dao.LivreDao;
import com.library.microlibrary.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private LivreDao livreDao;

    //Livres

    @GetMapping(value="Livres")
    public List<Livre> listeLivres() {

        return livreDao.findAll();

    }

    @PostMapping(value = "/Livres")
    public ResponseEntity<Void> ajouterProduit(@RequestBody Livre livre) {

       Livre livre1 = livreDao.save(livre);

       if (livre == null){

           return ResponseEntity.noContent().build();
       }

       URI location = ServletUriComponentsBuilder.fromCurrentRequest()
               .path("/{id}")
               .buildAndExpand(livre1.getId())
               .toUri();

       return ResponseEntity.created(location).build();
    }

    //Livres/{id}

    @GetMapping(value= "Livres/{id}")
    public Livre afficherUnLivre(@PathVariable int id){

        return livreDao.findById(id);
    }
}
