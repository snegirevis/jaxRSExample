package com.example.jaxrsexample.Config;

import com.example.jaxrsexample.Controllers.ClientController;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    public void init(){
        register(ClientController.class);
    }
}
