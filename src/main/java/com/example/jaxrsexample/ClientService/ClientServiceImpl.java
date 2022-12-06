package com.example.jaxrsexample.ClientService;

import com.example.jaxrsexample.models.Client;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Override
    public List<Client> getClients() {
        return Arrays.asList(
                new Client(1, "Vi", "27276@iitu.edu.kz" ),
                new Client(2, "Marzhan", "27488@iitu.edu.kz")
        );
    }
}
