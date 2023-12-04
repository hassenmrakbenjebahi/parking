package com.example.parking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParcAuto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idParcAuto;
    private String libelle;
    private Long capacite;
    @OneToMany(cascade = CascadeType.ALL )
    private Set<Voiture> voitures;
}
