package com.fc.mairiedigital.mdigitkati.services;

import com.fc.mairiedigital.mdigitkati.model.Actem;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;

import java.util.List;
//declaration des differents methodes

public interface Actemservice {
    Actem ajoutActem (Actem actem, Profils profils, Integer id);
    List<Actem> liste();
    void  modifier(Actem actem, Integer Id);
    Actem afficherById(Integer Id);
    String supprimerById(Integer Id);
}
