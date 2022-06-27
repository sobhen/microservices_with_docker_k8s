package com.microservices.cards.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardResponse {

    private Long cardId;
    private String cardNumber;
    private Customer customer;
    private String cardType;
    private BigDecimal totalLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;
    private Date createdDate;
}
