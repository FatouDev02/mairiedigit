package com.fc.mairiedigital.mdigitkati.services;

import com.fc.mairiedigital.mdigitkati.model.Acted;
import com.fc.mairiedigital.mdigitkati.model.Actediv;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;

import java.util.List;
//declaration des differents methodes

public interface Actedservice {
    Acted ajoutActed (Acted acted, Profils profils, Integer id);
    List<Acted> liste();
    void  modifier(Acted acted, Integer Id);
    Acted afficherById(Integer Id);
    String supprimerById(Integer Id);
}

