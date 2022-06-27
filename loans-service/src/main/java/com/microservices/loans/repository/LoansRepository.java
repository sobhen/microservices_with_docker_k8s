package com.microservices.loans.repository;

import com.microservices.loans.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loan, Long> {

    public List<Loan> findByCustomerIdOrderByStartDateDesc(Long customerId);
}
