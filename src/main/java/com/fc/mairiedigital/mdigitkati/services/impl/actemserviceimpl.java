package com.fc.mairiedigital.mdigitkati.services.impl;


import com.fc.mairiedigital.mdigitkati.model.Actem;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.ActemRepository;
import com.fc.mairiedigital.mdigitkati.services.Actemservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class actemserviceimpl implements Actemservice {
    @Autowired
    ActemRepository actemRepository;
    //implementation des differents méthodes

    @Override
    public Actem ajoutActem(Actem actem, Profils profils, Integer id) {
        return this.actemRepository.save(actem);
    }

    @Override
    public List<Actem> liste() {
        return this.actemRepository.findAll();
    }

    @Override
    public void modifier(Actem actem, Integer Id) {
        Actem users = this.actemRepository.findById(Id).orElseThrow();
        users.setNom_h(actem.getNom_h());
        users.setPrenom_h(actem.getPrenom_h());
        users.setDate_naissanceh(actem.getDate_naissanceh());
        users.setProfession_h(actem.getProfession_h());
        users.setNom_f(actem.getNom_f());
        users.setPrenom_f(actem.getPrenom_f());
        users.setDatenaissance_f(actem.getDatenaissance_f());
        users.setProfession_h(actem.getProfession_h());
        users.setDate_declarations(actem.getDate_declarations());
        users.setTemoin_h(actem.getTemoin_h());
        users.setTemoin_f(actem.getTemoin_f());
        users.setEtat(actem.getEtat());

    }

    @Override
    public Actem afficherById(Integer Id) {
        return this.actemRepository.findById(Id).get();
    }

    @Override
    public String supprimerById(Integer Id) {
        this.actemRepository.deleteById(Id);
        return "declarations supprimée  avec success";
    }
}
