package org.example.grami_salma_controle1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Date dateCommande;
    Double montantTotal;
    @ManyToOne
    @JoinColumn(name="client_id")
    Client client;
}
