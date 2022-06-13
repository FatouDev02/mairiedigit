package com.fc.mairiedigital.mdigitkati.services.impl;

import com.fc.mairiedigital.mdigitkati.model.Actediv;
import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.ActedivRepository;
import com.fc.mairiedigital.mdigitkati.services.Actedivservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class actedivserviceimpl implements Actedivservice {
    @Autowired
    ActedivRepository actedivRepository;
    //implementation des differents méthodes

    @Override
    public Actediv ajoutActediv(Actediv actediv, Profils profils, Integer id) {
        return this.actedivRepository.save(actediv);
    }

    @Override
    public List<Actediv> liste() {
        return this.actedivRepository.findAll();
    }

    @Override
    public void modifier(Actediv actediv, Integer Id) {
        Actediv users = this.actedivRepository.findById(Id).orElseThrow();
        users.setNom_h(actediv.getNom_h());
        users.setPrenom_h(actediv.getPrenom_h());
        users.setDate_naissanceh(actediv.getDate_naissanceh());
        users.setProfession_h(actediv.getProfession_h());
        users.setNom_f(actediv.getNom_f());
        users.setPrenom_f(actediv.getPrenom_f());
        users.setDatenaissance_f(actediv.getDatenaissance_f());
        users.setProfession_f(actediv.getProfession_f());
        users.setDate_mariage(actediv.getDate_mariage());
        users.setDate_divorce(actediv.getDate_divorce());
        users.setCause(actediv.getCause());
        users.setEtat(actediv.getEtat());

    }

    @Override
    public Actediv afficherById(Integer Id) {
        return this.actedivRepository.findById(Id).get();
    }

    @Override
    public String supprimerById(Integer Id) {
        this.actedivRepository.deleteById(Id);
        return "declarations supprimée  avec success";
    }
}
