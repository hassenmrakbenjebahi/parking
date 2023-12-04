package com.example.parking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVoiture;
    private String immatriculation;
    @Enumerated(EnumType.STRING)
    private Marque marque;
    @OneToOne
    private Chauffeur chauffeur;

}
