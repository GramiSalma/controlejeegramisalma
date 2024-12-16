package org.example.grami_salma_controle1.Repository;

import org.example.grami_salma_controle1.Entities.Client;
import org.example.grami_salma_controle1.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeRepository  extends JpaRepository<Commande,Long> {
}
