package com.example.jaxrsexample.Controllers;

import com.example.jaxrsexample.ClientService.ClientService;
import com.example.jaxrsexample.models.Client;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GET
    @Produces(APPLICATION_JSON)
    public ArrayList<Client> getClients(){
      return new ArrayList<Client>(clientService.getClients());
    }

}
