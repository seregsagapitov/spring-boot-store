package com.seregsagapitov.springbootstore.controllers;


import com.seregsagapitov.springbootstore.dao.ClientHibImpl;
import com.seregsagapitov.springbootstore.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private ClientService clientService;
    ClientHibImpl clientHib;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        //System.out.println(clientHib.findById_client(3L));
    return "index";
    }




}
