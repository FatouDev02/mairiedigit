package com.fc.mairiedigital.mdigitkati.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//table attributs getter&setter constructtor
public class Actem extends  AbstractEntity{
    private String nom_h;
    private  String prenom_h;
    private String date_naissanceh;
    private String profession_h;
    private String nom_f;
    private  String prenom_f;
    private String datenaissance_f;
    private String profession_f;
    private String date_declarations;
    private String temoin_h;
    private  String temoin_f;
    @Enumerated(EnumType.STRING)
    private Etat  etat;

    public Actem(String nom_h, String prenom_h, String date_naissanceh, String profession_h, String nom_f, String prenom_f, String datenaissance_f, String profession_f, String date_declarations, String temoin_h, String temoin_f, Etat etat) {
        this.nom_h = nom_h;
        this.prenom_h = prenom_h;
        this.date_naissanceh = date_naissanceh;
        this.profession_h = profession_h;
        this.nom_f = nom_f;
        this.prenom_f = prenom_f;
        this.datenaissance_f = datenaissance_f;
        this.profession_f = profession_f;
        this.date_declarations = date_declarations;
        this.temoin_h = temoin_h;
        this.temoin_f = temoin_f;
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

    public String getDate_declarations() {
        return date_declarations;
    }

    public void setDate_declarations(String date_declarations) {
        this.date_declarations = date_declarations;
    }

    public String getTemoin_h() {
        return temoin_h;
    }

    public void setTemoin_h(String temoin_h) {
        this.temoin_h = temoin_h;
    }

    public String getTemoin_f() {
        return temoin_f;
    }

    public void setTemoin_f(String temoin_f) {
        this.temoin_f = temoin_f;
    }
}
