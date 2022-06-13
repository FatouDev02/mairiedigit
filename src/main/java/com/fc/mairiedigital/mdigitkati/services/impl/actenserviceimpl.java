package com.fc.mairiedigital.mdigitkati.services.impl;

import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Personnes;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.ActenRepository;
import com.fc.mairiedigital.mdigitkati.services.Actenservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class actenserviceimpl implements Actenservice {
    @Autowired
    ActenRepository actenRepository;
    //implementation des differents méthodes


    @Override
    public Acten ajoutActen(Acten acten, Profils profils, Integer id) {
        return this.actenRepository.save(acten);
    }

    @Override
    public List<Acten> liste() {
        return this.actenRepository.findAll();
    }

    @Override
    public void modifier(Acten acten, Integer Id) {

        Acten users = this.actenRepository.findById(Id).orElseThrow();
        users.setNom(acten.getNom());
        users.setPrenom(acten.getPrenom());
        users.setDate_naissance(acten.getDate_naissance());
        users.setDate_declarations(acten.getDate_declarations());
        users.setPere(acten.getPere());
        users.setMere(acten.getMere());
        users.setEtat(acten.getEtat());


    }

    @Override
    public Acten afficherById(Integer Id) {
        return this.actenRepository.findById(Id).get();
    }

    @Override
    public String supprimerById(Integer Id) {
        this.actenRepository.deleteById(Id);
        return "declarations supprimée  avec success";
    }
}
