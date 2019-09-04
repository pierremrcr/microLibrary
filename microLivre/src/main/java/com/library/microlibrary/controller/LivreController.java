package com.library.microlibrary.controller;

import com.library.microlibrary.dao.LivreDao;
import com.library.microlibrary.exceptions.LivreIntrouvableException;
import com.library.microlibrary.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
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
    public ResponseEntity<Void> ajouterLivre(@Valid @RequestBody Livre livre) {

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
    public Livre afficherUnLivre(@PathVariable int id) throws LivreIntrouvableException {

        Livre livre = livreDao.findById(id);

        if(livre == null) throw new LivreIntrouvableException("Le livre avec l'id " + id + " n'existe pas");

        return livre;

    }

  //  @DeleteMapping (value = "/Livres/{id}")
  //  public void supprimerLivre(@PathVariable int id) {

  //      livreDao.delete(id);
  //  }

    @PutMapping (value = "/Livres")
    public void updateLivre(@RequestBody Livre livre) {

        livreDao.save(livre);
    }
}
