package com.microservices.accounts.controller;

import com.microservices.accounts.entity.Accounts;
import com.microservices.accounts.model.AccountResponse;
import com.microservices.accounts.services.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts/")
public class AccountsController {

    @Autowired
    AccountsService accountsService;

    @GetMapping("/{customerId}")
    public AccountResponse getAccountsByCustomerId(@PathVariable Long customerId) {
        return accountsService.getAccountsByCustomerId(customerId);
    }
}

