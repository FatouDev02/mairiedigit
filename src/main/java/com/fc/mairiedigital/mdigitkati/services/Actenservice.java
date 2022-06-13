package com.fc.mairiedigital.mdigitkati.services;

import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;

import java.util.List;
//declaration des differents methodes
public interface Actenservice {
    Acten ajoutActen (Acten acten, Profils profils, Integer id);
    List<Acten> liste();
    void  modifier(Acten acten, Integer Id);
    Acten afficherById(Integer Id);
    String supprimerById(Integer Id);
}
