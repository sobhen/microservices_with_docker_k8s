package com.microservices.accounts.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
public class Customer {

    private Long customerId;
    private String customerName;
    private String email;
    private String mobileNo;
    private Date createdDate;

}
