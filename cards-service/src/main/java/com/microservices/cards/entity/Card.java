package com.microservices.cards.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "T_CARDS")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CARD_ID")
    private Long cardId;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "TOTAL_LIMIT")
    private BigDecimal totalLimit;

    @Column(name = "AMOUNT_USED")
    private BigDecimal amountUsed;

    @Column(name = "AVAILABLE_AMOUNT")
    private BigDecimal availableAmount;

    @Column(name = "CREATE_DT")
    private Date createdDate;
}
