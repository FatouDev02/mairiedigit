package com.fc.mairiedigital.mdigitkati.controller;


import com.fc.mairiedigital.mdigitkati.model.Personnes;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.services.Personneservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/mdigitkati/personne")
@CrossOrigin("*")
public class PersonneController {
    @Autowired
    Personneservice personneservice;

    @PostMapping("/ajouter")
    public Personnes ajouter (@RequestBody Personnes personnes,@PathVariable Profils profils,@PathVariable Integer id){
        return this.personneservice.ajoutPersonne(personnes,profils,id);
    }


    @GetMapping("/lister")
    public List<Personnes> liste(){
        return this.personneservice.liste();
    }
    @GetMapping("/{id}")
    public Personnes infos (@PathVariable ("id") Integer id){
        return this.personneservice.afficherbyId(id);
    }
    @PutMapping("/modifier/{id}")
    public String modifier(@RequestBody Personnes personnes, @PathVariable("id") Integer Id){
        this.personneservice.modifiercompte(personnes, Id);
        return "Mise à jours valider";
    }
    @DeleteMapping("/supprimer/{id}")
    public String supprimer(@PathVariable("id") Integer id){
        this.personneservice.supprimer(id);
        return "Supprimer avec success";
    }
    @GetMapping("/connexion/{email}&{password}")
    public Personnes connexion(@PathVariable("email") String email,@PathVariable("password") String password){
        return personneservice.connexion(email,password);
    }


}
