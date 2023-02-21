package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreedPerson greet(){
        return new GreedPerson("He", List.of("Java", "Go", "JS"), new Person("Tu"));
    }

    record Person(String name){

    }

    record GreedPerson(
            String greet,
            List<String> favProGrLan,
            Person peson
    ){

    }
}
