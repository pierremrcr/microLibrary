package com.library.microlibrary.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Bibliotheque {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nom")
    @Size(min = 1, max = 50)
    private int nom;
    @Column(name = "telephone")
    @Size(min = 1, max = 10)
    private String telephone;

    public Bibliotheque(int nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    public Bibliotheque(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "id=" + id +
                ", nom=" + nom +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
