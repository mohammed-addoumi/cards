package com.microservices.services;

import com.microservices.dao.CardRepository;
import com.microservices.model.Card;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }
}
