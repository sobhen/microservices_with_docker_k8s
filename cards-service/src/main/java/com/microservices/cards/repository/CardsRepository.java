package com.microservices.cards.repository;

import com.microservices.cards.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Card, Long> {

    public List<Card> findByCustomerIdOrderByCardId(Long customerId);
}
