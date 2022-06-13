package com.fc.mairiedigital.mdigitkati.controller;

import com.fc.mairiedigital.mdigitkati.model.Actediv;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.services.Actedivservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mdigitkati/actediv")
@CrossOrigin("*")
public class ActedivController  {
    @Autowired

    Actedivservice actedivservice;
    @PostMapping("/ajout")
    public Actediv ajouter (@RequestBody Actediv actediv, @PathVariable Profils profils, @PathVariable Integer id){
        return  this.actedivservice.ajoutActediv(actediv,profils,id);
    }
    @GetMapping("lister")
    public List<Actediv> liste(){
        return  this.actedivservice.liste();
    }
    @GetMapping("/{id}")
    public  Actediv infos (@PathVariable ("id") Integer id){
        return this.actedivservice.afficherById(id);
    }
    @PutMapping("/modifier/{id}")
    public String  modifier (@PathVariable Actediv actediv,@PathVariable("id") Integer Id){
        this.actedivservice.modifier(actediv,Id);
        return "Mise a jour valider";
    }
    @DeleteMapping("/supprimer/{id}")
    public String supprimer(@PathVariable("id") Integer id){
        this.actedivservice.supprimerById(id);
        return "suppression";
    }
}
