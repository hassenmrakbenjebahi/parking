package com.example.parking.controller;

import com.example.parking.entity.Chauffeur;
import com.example.parking.entity.Voiture;
import com.example.parking.service.IVoiture;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/voitures")
public class ParkingRestController {
    IVoiture iVoiture;

    @PostMapping("/ajouter-voiture")
    public Voiture addvoiture(@RequestBody Voiture v){
        Voiture voiture= iVoiture.AjouterVoiture(v);
        return voiture;
    }
@PutMapping("/affecter-parcauto-a-voiture/{idParc}/{idVoiture}")
    public void affecter_parc_a_voiture(@PathVariable("idParc") Long idparc,@PathVariable("idVoiture") Long idvoiture){
        iVoiture.AffecterParAutoAvoiture(idparc,idvoiture);
}

@GetMapping("/Liste-chauffeurs-par-parc/{idparc}")
public List<Chauffeur> ListChauffeurParParc(@PathVariable("idparc") Long idparc){
        List<Chauffeur> listChauffeur = iVoiture.ListChauffeurParParcAuto(idparc);

        return listChauffeur;
}

}
