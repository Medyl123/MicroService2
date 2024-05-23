package com.atos.microservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/zeom")
    public String index() {
        return "Greetings from Spring Boot! Micro service 2 ";
    }

    @GetMapping("/zeom/search/{number}")
    public Mono index2(@PathVariable("number")  int number) {
        if (number == 1)
            return Mono.just("Moez Niahahahaha ");
        if (number == 2)
            return Mono.just("Maher Hohohoho ");
        return Mono.just("Inexistant Mouahahahaha ");
    }

}
