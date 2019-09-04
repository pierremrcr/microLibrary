package com.library.microlibrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Membre {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nom")
    @Size(min = 1, max = 50)
    private String nom;
    @Column(name = "prenom")
    @Size(min = 1, max = 50)
    private String prenom;
    @Column(name = "adresse_mail")
    @Size(min = 1, max = 50)
    private String adresse_mail;
    @Column(name = "mot_de_passe")
    @Size(min = 1, max = 10)
    private String mot_de_passe;
    @Column(name = "telephone")
    @Size(min = 1, max = 10)
    private String telephone;

    public Membre( String nom, String prenom, String adresse_mail, String mot_de_passe, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse_mail = adresse_mail;
        this.mot_de_passe = mot_de_passe;
        this.telephone = telephone;
    }

    public Membre(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse_mail='" + adresse_mail + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
