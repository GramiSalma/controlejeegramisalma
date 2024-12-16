package org.example.grami_salma_controle1.Service;

import org.example.grami_salma_controle1.Entities.Client;
import org.example.grami_salma_controle1.Entities.Commande;
import org.example.grami_salma_controle1.Repository.ClientRepository;
import org.example.grami_salma_controle1.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CommandeService {
    @Autowired
    CommandeRepository commandeRepository;
    @Autowired
    ClientRepository clientRepository;
    public Commande ajouterCommande(Commande commande,Long idClient){
        Client c1=clientRepository.findById(idClient).get();
     commande.setClient(c1);
        return commandeRepository.save(commande);
    }

    public List<Commande> getCommandes() {
        return commandeRepository.findAll();
    }

    public Optional<Commande> getCommandeById(Long id) {
        return commandeRepository.findById(id);
    }


    public boolean deleteCommande(Long id){

        commandeRepository.delete(commandeRepository.findById(id).get());
        return true;
    }



}







