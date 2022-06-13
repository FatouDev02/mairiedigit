package com.fc.mairiedigital.mdigitkati.services;

import com.fc.mairiedigital.mdigitkati.model.Personnes;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
//declaration des differents methodes

public interface Personneservice {
    Personnes ajoutPersonne(Personnes personnes, Profils profils, Integer id);
    List<Personnes> liste ();
    void modifiercompte(Personnes personnes,Integer Id);
    Personnes afficherbyId(Integer Id);
    String supprimer(Integer Id);
    Personnes connexion(String email,String password);
}
