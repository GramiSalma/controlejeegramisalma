package org.example.grami_salma_controle1.Controller;


import org.example.grami_salma_controle1.Entities.Client;
import org.example.grami_salma_controle1.Entities.Commande;
import org.example.grami_salma_controle1.Service.ClientService;
import org.example.grami_salma_controle1.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientCommandesController {


    @Autowired
    private CommandeService commandeService;

    @Autowired
    private ClientService clientService;
    @QueryMapping
    public List<Commande> getCommandes() {
        return commandeService.getCommandes();
    }

    @QueryMapping
    public Commande getCommandeById(@Argument Long id) {
        return commandeService.getCommandeById(id).orElse(null);
    }

    @MutationMapping
    public Commande addCommande(@Argument Commande commande , @Argument Long clientId) {

        return commandeService.ajouterCommande(commande,clientId);
    }

    @MutationMapping
    public Boolean deleteCommande(@Argument Long id) {
        commandeService.deleteCommande(id);
        return true;
    }

    @QueryMapping
    public List<Client> getClients(){
        return clientService.getClients();
    }
}



