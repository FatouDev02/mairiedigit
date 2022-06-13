package com.fc.mairiedigital.mdigitkati.controller;

import com.fc.mairiedigital.mdigitkati.model.Acted;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.services.Actedivservice;
import com.fc.mairiedigital.mdigitkati.services.Actedservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdigitkati/acted")
@CrossOrigin("*")
public class ActedController  {
    @Autowired
    Actedservice actedservice;
    @PostMapping("/ajout")
    public Acted ajouter (@RequestBody Acted acted, @PathVariable Profils profils, @PathVariable Integer id){
        return  this.actedservice.ajoutActed(acted,profils,id);
    }
    @GetMapping("lister")
    public List<Acted> liste(){
        return  this.actedservice.liste();
    }
    @GetMapping("/{id}")
    public  Acted infos (@PathVariable ("id") Integer id){
        return this.actedservice.afficherById(id);
    }
    @PutMapping("/modifier/{id}")
    public String  modifier (@PathVariable Acted acted,@PathVariable("id") Integer Id){
        this.actedservice.modifier(acted,Id);
        return "Mise a jour valider";
    }
    @DeleteMapping("/supprimer/{id}")
    public String supprimer(@PathVariable("id") Integer id){
        this.actedservice.supprimerById(id);
        return "suppression";
    }
}