package com.seregsagapitov.springbootstore.services;


import com.seregsagapitov.springbootstore.entities.ClientHib;
import com.seregsagapitov.springbootstore.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;


    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientHib> getAllClients(){
        return (List<ClientHib>)clientRepository.findAll();
    }
}
