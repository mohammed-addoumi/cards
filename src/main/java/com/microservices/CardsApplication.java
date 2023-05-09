package com.microservices;

import com.microservices.dao.CardRepository;
import com.microservices.model.Card;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardsApplication {

    @Autowired private CardRepository cardRepository;

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

    @PostConstruct
    public void init() {
        cardRepository.save(new Card(1L, "Card 1"));
        cardRepository.save(new Card(2L, "Card 2"));
        cardRepository.save(new Card(3L, "Card 3"));
        cardRepository.save(new Card(4L, "Card 4"));
        cardRepository.save(new Card(5L, "Card 5"));
    }
}
