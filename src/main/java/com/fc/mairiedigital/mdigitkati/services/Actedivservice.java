package com.fc.mairiedigital.mdigitkati.services;

import com.fc.mairiedigital.mdigitkati.model.Actediv;
import com.fc.mairiedigital.mdigitkati.model.Actem;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;

import java.util.List;
//declaration des differents methodes

public interface Actedivservice {
    Actediv ajoutActediv (Actediv actediv, Profils profils, Integer id);
    List<Actediv> liste();
    void  modifier(Actediv actediv, Integer Id);
    Actediv afficherById(Integer Id);
    String supprimerById(Integer Id);
}
