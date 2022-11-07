package com.example.EstockExchangeCogJava231.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EstockExchangeCogJava231.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
