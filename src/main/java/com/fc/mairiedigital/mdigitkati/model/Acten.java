package com.fc.mairiedigital.mdigitkati.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//table attributs getter&setter constructtor
public class Acten extends AbstractEntity {
    private String nom;
    private  String prenom;
    private String date_naissance;
    private String date_declarations;
    private String pere;
    private  String mere;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated (EnumType.STRING)
    private Etat etat;

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Acten(String nom, String prenom, String date_naissance, String date_declarations, String pere, String mere, Genre genre, Etat etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.date_declarations = date_declarations;
        this.pere = pere;
        this.mere = mere;
        this.genre = genre;
        this.etat = etat;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
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

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getDate_declarations() {
        return date_declarations;
    }

    public void setDate_declarations(String date_declarations) {
        this.date_declarations = date_declarations;
    }

    public String getPere() {
        return pere;
    }

    public void setPere(String pere) {
        this.pere = pere;
    }

    public String getMere() {
        return mere;
    }

    public void setMere(String mere) {
        this.mere = mere;
    }
}
