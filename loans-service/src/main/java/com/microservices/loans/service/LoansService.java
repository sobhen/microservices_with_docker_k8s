package com.microservices.loans.service;

import com.microservices.loans.entity.Loan;
import com.microservices.loans.model.Customer;
import com.microservices.loans.model.LoanResponse;
import com.microservices.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoansService {

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    private CustomerFeignClient customerFeignClient;

    public List<LoanResponse> getLoansByCustomerId(Long customerId) {

        List<Loan> loans = loansRepository.findByCustomerIdOrderByStartDateDesc(customerId);
        Customer customer = customerFeignClient.getCustomerById(customerId);

        return loans.stream().map(
                loan -> new LoanResponse(
                        loan.getLoanId(), customer, loan.getStartDate(), loan.getLoanType(),
                        loan.getTotalLoan(), loan.getAmountPaid(), loan.getOutstandingAmount(), loan.getCreatedDate()
                )
        ).collect(Collectors.toList());
    }
}
