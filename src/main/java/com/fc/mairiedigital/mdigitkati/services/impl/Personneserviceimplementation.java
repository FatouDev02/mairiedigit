package com.fc.mairiedigital.mdigitkati.services.impl;

import com.fc.mairiedigital.mdigitkati.model.Personnes;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.PersonneRepository;
import com.fc.mairiedigital.mdigitkati.services.Personneservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class Personneserviceimplementation  implements Personneservice {
    @Autowired
    PersonneRepository personneRepository;
//implementation des differents méthodes
    @Override
    public Personnes ajoutPersonne(Personnes personnes, Profils profils, Integer id) {
        return this.personneRepository.save(personnes);

    }



    @Override
    public List<Personnes> liste() {
        return this.personneRepository.findAll();
    }

    @Override
    public void modifiercompte(Personnes personnes, Integer Id) {
        Personnes utilisateurs = this.personneRepository.findById(Id).orElseThrow();
        utilisateurs.setNom(personnes.getNom());
        utilisateurs.setPrenom(personnes.getPrenom());
        utilisateurs.setAdresse(personnes.getAdresse());
        utilisateurs.setEmail(personnes.getEmail());
        utilisateurs.setDateNaissance(personnes.getDateNaissance());
        utilisateurs.setEtatCivil(personnes.getEtatCivil());
        utilisateurs.setPassword(personnes.getPassword());
        utilisateurs.setNumeros(personnes.getNumeros());
        utilisateurs.setProfils(personnes.getProfils());
    }

    @Override
    public Personnes afficherbyId(Integer Id) {
        return this.personneRepository.findById(Id).get();
    }

    @Override
    public String supprimer(Integer Id) {
        this.personneRepository.deleteById(Id);
        return "Compte Supprimer avec success";
    }

    @Override
    public Personnes connexion(String email, String password) {
        Optional<Personnes> personnes= personneRepository.findByEmailAndPassword(email,password);
        //si les donnees ne correspondent pas ou si cest vide
        if(personnes.isEmpty()){
            return null;
        }
        //sinon renvoie tout ses infs
        return personnes.get();
    }

}
