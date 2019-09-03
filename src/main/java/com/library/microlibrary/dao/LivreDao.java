package com.library.microlibrary.dao;

import com.library.microlibrary.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreDao extends JpaRepository<Livre, Integer> {

     List<Livre> findAll();

     Livre findById(int id);

     Livre save(Livre livre);

    // void delete(int id);



}
