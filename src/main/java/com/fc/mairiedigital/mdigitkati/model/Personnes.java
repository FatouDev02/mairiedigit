package com.fc.mairiedigital.mdigitkati.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//table attributs getter&setter constructtor
public class Personnes extends AbstractEntity{
    private String nom;

    private String prenom;

    private String dateNaissance;

    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String numeros;

    private String password;

    private String adresse;



    @Enumerated (EnumType.STRING)
    private Profils profils;

    @Enumerated (EnumType.STRING)
    private EtatCivil etatCivil;

    @Enumerated (EnumType.STRING)
    private Etat etat;

    public Personnes(String nom, String prenom, String dateNaissance, String email, String numeros, String password, String adresse,  Profils profils, EtatCivil etatCivil, Etat etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.numeros = numeros;
        this.password = password;
        this.adresse = adresse;
        this.profils = profils;
        this.etatCivil = etatCivil;
        this.etat = etat;
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Profils getProfils() {
        return profils;
    }

    public void setProfils(Profils profils) {
        this.profils = profils;
    }

    public EtatCivil getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(EtatCivil etatCivil) {
        this.etatCivil = etatCivil;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
