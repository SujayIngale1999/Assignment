package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.model.CountryCurrency;
@Repository
public interface CountryCurrencyrepo extends JpaRepository<CountryCurrency, Integer>{

}
