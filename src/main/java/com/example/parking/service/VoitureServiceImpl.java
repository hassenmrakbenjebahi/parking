package com.example.parking.service;

import com.example.parking.entity.Chauffeur;
import com.example.parking.entity.ParcAuto;
import com.example.parking.entity.Voiture;
import com.example.parking.repository.ParcAutoRepository;
import com.example.parking.repository.VoitureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VoitureServiceImpl implements IVoiture {
    VoitureRepository voitureRepository;
    ParcAutoRepository parcAutoRepository;

    @Override
    public Voiture AjouterVoiture(Voiture v) {

        return voitureRepository.save(v);   }

    @Override
    public void AffecterParAutoAvoiture(Long idParc, Long idVoiture) {
        ParcAuto parc=parcAutoRepository.findById(idParc).get();
        Voiture voiture= voitureRepository.findById(idVoiture).get();
        parc.getVoitures().add(voiture);
        parcAutoRepository.save(parc);
    }

    @Override
    public List<Chauffeur> ListChauffeurParParcAuto(Long idParc) {
        List<Chauffeur>listChauffeur = new ArrayList<>();
        ParcAuto parc = parcAutoRepository.findById(idParc).get();
        List<Voiture> listVoitures=parc.getVoitures().stream().toList();
       for(int i=0 ; i<listVoitures.size();i++){
           listChauffeur.add(listVoitures.get(i).getChauffeur());
       }

        return listChauffeur;
    }
}
