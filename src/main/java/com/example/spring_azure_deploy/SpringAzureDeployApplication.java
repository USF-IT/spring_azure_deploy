package com.example.spring_azure_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDeployApplication {


    @GetMapping("/message")
    public String message(){
        return "Congrats! Your app is deployed successfully in Azure!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDeployApplication.class, args);
    }

}
