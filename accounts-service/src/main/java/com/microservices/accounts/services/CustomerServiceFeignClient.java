package com.microservices.accounts.services;


import com.microservices.accounts.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${customer.service.base-url}", path = "/api/customers", value = "customer-feign-client")
public interface CustomerServiceFeignClient {

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId);

}
