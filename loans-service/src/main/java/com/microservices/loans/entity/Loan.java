package com.microservices.loans.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "T_LOANS")
@Data
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOAN_ID")
    private Long loanId;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "START_DT")
    private Date startDate;

    @Column(name = "LOAN_TYPE")
    private String loanType;

    @Column(name = "TOTAL_LOAN")
    private BigDecimal totalLoan;

    @Column(name = "AMOUNT_PAID")
    private BigDecimal amountPaid;

    @Column(name = "OUTSTANDING_AMOUNT")
    private BigDecimal outstandingAmount;

    @Column(name = "CREATE_DT")
    private Date createdDate;

}
