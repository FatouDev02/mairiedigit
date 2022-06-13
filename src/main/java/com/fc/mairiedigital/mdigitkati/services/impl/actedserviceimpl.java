package com.fc.mairiedigital.mdigitkati.services.impl;

import com.fc.mairiedigital.mdigitkati.model.Acted;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.ActedRepository;
import com.fc.mairiedigital.mdigitkati.services.Actedservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class actedserviceimpl implements Actedservice {
    @Autowired
    ActedRepository actedRepository;
    //implementation des differents méthodes

    @Override
    public Acted ajoutActed(Acted acted, Profils profils, Integer id) {
        return this.actedRepository.save(acted);
    }

    @Override
    public List<Acted> liste() {
        return this.actedRepository.findAll();
    }

    @Override
    public void modifier(Acted acted, Integer Id) {
        Acted users = this.actedRepository.findById(Id).orElseThrow();
        users.setNom(acted.getNom());
        users.setPrenom(acted.getPrenom());
        users.setDate_naissance(acted.getDate_naissance());
        users.setDate_deces(acted.getDate_deces());
        users.setPere(acted.getPere());
        users.setMere(acted.getMere());
        users.setEtatCivil(acted.getEtatCivil());
    }

    @Override
    public Acted afficherById(Integer Id) {
        return this.actedRepository.findById(Id).get();
    }

    @Override
    public String supprimerById(Integer Id) {
        this.actedRepository.deleteById(Id);
        return "declarations supprimée  avec success";
    }
}
