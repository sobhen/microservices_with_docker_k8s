package com.microservices.accounts.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_ACCOUNTS")
@Data
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "BRANCH_ADDRESS")
    private String branchAddress;

    @Column(name = "CREATE_DT")
    private Date createdDate;
}
