package com.microservices.accounts.services;

import com.microservices.accounts.entity.Accounts;
import com.microservices.accounts.model.AccountResponse;
import com.microservices.accounts.model.Customer;
import com.microservices.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    CustomerServiceFeignClient customerServiceFeignClient;

    public AccountResponse getAccountsByCustomerId(Long customerId) {
        Accounts acct = accountsRepository.findByCustomerId(customerId);
        Customer customer = customerServiceFeignClient.getCustomerById(customerId);
        return new AccountResponse(
                acct.getAccountId(), customer,
                acct.getAccountNumber(), acct.getAccountType(),
                acct.getBranchAddress(),acct.getCreatedDate()
        );
    }

}
