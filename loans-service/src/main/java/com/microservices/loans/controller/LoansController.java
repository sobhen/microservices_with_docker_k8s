package com.microservices.loans.controller;

import com.microservices.loans.model.LoanResponse;
import com.microservices.loans.service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoansController {

    @Autowired
    private LoansService loansService;

    @GetMapping("/{customerId}")
    public List<LoanResponse> getLoansByCustomerId(@PathVariable Long customerId) {
        return loansService.getLoansByCustomerId(customerId);
    }
}
