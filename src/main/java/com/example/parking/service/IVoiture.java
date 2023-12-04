package com.example.parking.service;

import com.example.parking.entity.Chauffeur;
import com.example.parking.entity.Voiture;

import java.util.List;

public interface IVoiture {
    public Voiture AjouterVoiture(Voiture v);
    public void AffecterParAutoAvoiture(Long idParc,Long idVoiture);
    public List<Chauffeur> ListChauffeurParParcAuto(Long idParc);
}
