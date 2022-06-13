package com.fc.mairiedigital.mdigitkati.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//table attributs getter&setter constructtor
public class Actediv extends AbstractEntity{
    private String nom_h;
    private  String prenom_h;
    private String date_naissanceh;
    private String profession_h;
    private String nom_f;
    private  String prenom_f;
    private String datenaissance_f;
    private String profession_f;
    private String date_mariage;
    private String date_divorce;
    private  String cause;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    public Actediv(String nom_h, String prenom_h, String date_naissanceh, String profession_h, String nom_f, String prenom_f, String datenaissance_f, String profession_f, String date_mariage, String date_divorce, String cause, Etat etat) {
        this.nom_h = nom_h;
        this.prenom_h = prenom_h;
        this.date_naissanceh = date_naissanceh;
        this.profession_h = profession_h;
        this.nom_f = nom_f;
        this.prenom_f = prenom_f;
        this.datenaissance_f = datenaissance_f;
        this.profession_f = profession_f;
        this.date_mariage = date_mariage;
        this.date_divorce = date_divorce;
        this.cause = cause;
        this.etat = etat;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getNom_h() {
        return nom_h;
    }

    public void setNom_h(String nom_h) {
        this.nom_h = nom_h;
    }

    public String getPrenom_h() {
        return prenom_h;
    }

    public void setPrenom_h(String prenom_h) {
        this.prenom_h = prenom_h;
    }

    public String getDate_naissanceh() {
        return date_naissanceh;
    }

    public void setDate_naissanceh(String date_naissanceh) {
        this.date_naissanceh = date_naissanceh;
    }

    public String getProfession_h() {
        return profession_h;
    }

    public void setProfession_h(String profession_h) {
        this.profession_h = profession_h;
    }

    public String getNom_f() {
        return nom_f;
    }

    public void setNom_f(String nom_f) {
        this.nom_f = nom_f;
    }

    public String getPrenom_f() {
        return prenom_f;
    }

    public void setPrenom_f(String prenom_f) {
        this.prenom_f = prenom_f;
    }

    public String getDatenaissance_f() {
        return datenaissance_f;
    }

    public void setDatenaissance_f(String datenaissance_f) {
        this.datenaissance_f = datenaissance_f;
    }

    public String getProfession_f() {
        return profession_f;
    }

    public void setProfession_f(String profession_f) {
        this.profession_f = profession_f;
    }

    public String getDate_mariage() {
        return date_mariage;
    }

    public void setDate_mariage(String date_mariage) {
        this.date_mariage = date_mariage;
    }

    public String getDate_divorce() {
        return date_divorce;
    }

    public void setDate_divorce(String date_divorce) {
        this.date_divorce = date_divorce;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
