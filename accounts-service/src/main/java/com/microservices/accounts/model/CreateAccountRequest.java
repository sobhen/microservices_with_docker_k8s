package com.microservices.accounts.model;

import javax.persistence.Column;
import java.sql.Date;

public class CreateAccountRequest {

    private Long customerId;
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
