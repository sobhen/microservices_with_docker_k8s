package com.microservices.accounts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {

    private Long accountId;
    private Customer customer;
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private Date createdDate;
}
