package com.microservices.loans.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    private Long loanId;
    private Customer customer;
    private Date startDate;
    private String loanType;
    private BigDecimal totalLoan;
    private BigDecimal amountPaid;
    private BigDecimal outstandingAmount;
    private Date createdDate;
}
