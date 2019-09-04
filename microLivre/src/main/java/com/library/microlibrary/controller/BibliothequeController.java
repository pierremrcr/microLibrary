package com.library.microlibrary.controller;

import com.library.microlibrary.dao.BibliothequeDao;
import com.library.microlibrary.exceptions.BibliothequeIntrouvableException;
import com.library.microlibrary.model.Bibliotheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class BibliothequeController {

    @Autowired
    BibliothequeDao bibliothequeDao;

    //Livres
    @GetMapping(value="Bibliotheques")
    public List<Bibliotheque> listeBibliotheques() {

        return bibliothequeDao.findAll();

    }

    @PostMapping(value = "/Bibliotheques")
    public ResponseEntity<Void> ajouterBibliotheque(@Valid @RequestBody Bibliotheque bibliotheque) {

        Bibliotheque bibliotheque1 = bibliothequeDao.save(bibliotheque);

        if (bibliotheque == null){

            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bibliotheque1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    //Bibliotheques/{id}
    @GetMapping(value= "Bibliotheques/{id}")
    public Bibliotheque afficherUneBibliotheque(@PathVariable int id) throws BibliothequeIntrouvableException {


            Bibliotheque bibliotheque = bibliothequeDao.findById(id);

            if(bibliotheque == null) throw new BibliothequeIntrouvableException ("La bibliothèque avec l'id " + id + " n'existe pas");

            return bibliotheque;

        }

    @PutMapping (value = "/Bibliotheques")
    public void updateBibliotheque(@RequestBody Bibliotheque bibliotheque) {

        bibliothequeDao.save(bibliotheque);
    }

}





