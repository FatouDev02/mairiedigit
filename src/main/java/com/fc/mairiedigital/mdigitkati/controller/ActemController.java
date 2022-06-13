package com.fc.mairiedigital.mdigitkati.controller;


import com.fc.mairiedigital.mdigitkati.model.Actem;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.services.Actemservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mdigitkati/actem")
@CrossOrigin("*")
public class ActemController  {
    @Autowired
    Actemservice actemservice;
    @PostMapping("/ajout")
    public Actem ajouter (@RequestBody Actem actem,@PathVariable Profils profils,@PathVariable Integer id){
        return  this.actemservice.ajoutActem(actem,profils,id);
    }
    @GetMapping("lister")
    public List<Actem> liste(){
        return  this.actemservice.liste();
    }
    @GetMapping("/{id}")
    public  Actem infos (@PathVariable ("id") Integer id){
        return this.actemservice.afficherById(id);
    }
    @PutMapping("/modifier/{id}")
    public String  modifier (@PathVariable Actem actem,@PathVariable("id") Integer Id){
        this.actemservice.modifier(actem,Id);
        return "Mise a jour valider";
    }
    @DeleteMapping("/supprimer/{id}")
        public String supprimer(@PathVariable("id") Integer id){
        this.actemservice.supprimerById(id);
        return "suppression";
    }
}
