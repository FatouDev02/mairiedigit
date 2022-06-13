package com.fc.mairiedigital.mdigitkati.controller;

import com.fc.mairiedigital.mdigitkati.model.Acten;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.services.Actenservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdigitkati/acten")
@CrossOrigin("*")
public class ActenController {
    @Autowired
    Actenservice actenservice;
    @PostMapping("/ajout")
    public Acten ajouter (@RequestBody Acten acten,@PathVariable Profils profils,@PathVariable Integer id){
        return this.actenservice.ajoutActen(acten, profils, id);
    }
    @GetMapping("lister")
    public List<Acten> liste(){
        return  this.actenservice.liste();
    }
    @GetMapping("/{id}")
    public Acten infos (@PathVariable ("id") Integer id){
        return  this.actenservice.afficherById(id);
    }
    @PutMapping("/mofifier/{id}")
    public String modifier (@PathVariable Acten acten,@PathVariable("id") Integer Id){

         this.actenservice.modifier(acten,Id);
         return "Mise à jours valier";
    }
    @DeleteMapping("/supprimer/{id")
    public String supprimer(@PathVariable("id") Integer id){
        this.actenservice.supprimerById(id);
        return "supprimer avec succès";
    }




}
