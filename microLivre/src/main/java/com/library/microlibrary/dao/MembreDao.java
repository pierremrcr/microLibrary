package com.library.microlibrary.dao;
import com.library.microlibrary.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembreDao extends JpaRepository<Membre, Integer> {


    List<Membre> findAll();

    Membre findById(int id);

    Membre save(Membre membre);

}
