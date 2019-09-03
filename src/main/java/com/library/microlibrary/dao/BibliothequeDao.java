package com.library.microlibrary.dao;

import com.library.microlibrary.model.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BibliothequeDao extends JpaRepository<Bibliotheque, Integer> {

   List<Bibliotheque> findAll();

   Bibliotheque findById(int id);

   Bibliotheque save (Bibliotheque bibliotheque);



}
