package com.example.demo;

import com.example.demo.config.PsqlConfigRepository;
import com.example.demo.model.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var configLoader = context.getBean(PsqlConfigRepository.class);

        var config = new Config(1, "Petya", "some");
        configLoader.save(config);






    }

}
