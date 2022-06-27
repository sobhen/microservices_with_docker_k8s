package com.microservices.cards.service;

import com.microservices.cards.entity.Card;
import com.microservices.cards.model.CardResponse;
import com.microservices.cards.model.Customer;
import com.microservices.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardsService {

    @Autowired
    CardsRepository cardsRepository;

    @Autowired
    CustomerFeignClient customerFeignClient;

    public List<CardResponse> getCardsByCustomerId(Long customerId) {

        Customer customer = customerFeignClient.getCustomerById(customerId);
        List<Card> cards = cardsRepository.findByCustomerIdOrderByCardId(customerId);

        return cards.stream().map(card ->
           new CardResponse(
                   card.getCardId(),card.getCardNumber(), customer,
                   card.getCardType(), card.getTotalLimit(), card.getAmountUsed(),
                   card.getAvailableAmount(), card.getCreatedDate())
        ).collect(Collectors.toList());
    }
}
