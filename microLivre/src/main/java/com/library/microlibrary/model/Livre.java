package com.library.microlibrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Livre {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "titre")
    @Size(min = 1, max = 50)
    private String titre;
    @Column(name = "auteur")
    @Size(min = 1, max = 25)
    private String auteur;
    @Column(name = "genre")
    @Size(min = 1, max = 25)
    private String genre;
    @Column(name = "date_publication")
    @Size(min = 1, max = 15)
    private String date_publication;
    @Column(name="resume")
    @Size(min = 1, max = 2500)
    private String resume;

    public Livre(int id, String titre, String auteur, String genre, String date_publication, String resume) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.date_publication = date_publication;
        this.resume = resume;
    }

    public Livre(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", genre='" + genre + '\'' +
                ", date_publication=" + date_publication +
                ", resume='" + resume + '\'' +
                '}';
    }
}
