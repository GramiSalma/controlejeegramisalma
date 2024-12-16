package org.example.grami_salma_controle1.Service;


import org.example.grami_salma_controle1.Entities.Client;
import org.example.grami_salma_controle1.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
   public List<Client> getClients(){
       return clientRepository.findAll();
   }
}
