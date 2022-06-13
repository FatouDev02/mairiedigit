package com.fc.mairiedigital.mdigitkati.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//table attributs getter&setter constructtor
public class Acted extends AbstractEntity {
    private String nom;
    private  String prenom;
    private String date_naissance;
    private String date_deces;
    private String pere;
    private  String mere;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated (EnumType.STRING)
    private EtatCivil etatCivil;

    public Acted(String nom, String prenom, String date_naissance, String date_deces, String pere, String mere, Genre genre, EtatCivil etatCivil) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.date_deces = date_deces;
        this.pere = pere;
        this.mere = mere;
        this.genre = genre;
        this.etatCivil = etatCivil;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public EtatCivil getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(EtatCivil etatCivil) {
        this.etatCivil = etatCivil;
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

    public String getDate_deces() {
        return date_deces;
    }

    public void setDate_deces(String date_deces) {
        this.date_deces = date_deces;
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
