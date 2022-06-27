package com.microservices.cards.controller;

import com.microservices.cards.model.CardResponse;
import com.microservices.cards.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cards/")
public class CardsController {

    @Autowired
    CardsService cardsService;

    @GetMapping("/{customerId}")
    public List<CardResponse> getCardsByCustomerId(@PathVariable Long customerId) {
        return cardsService.getCardsByCustomerId(customerId);
    }
}
