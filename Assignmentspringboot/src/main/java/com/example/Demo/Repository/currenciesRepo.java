package com.example.Demo.Repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Repository;

import com.example.Demo.model.Currencies;
@Repository
public interface currenciesRepo extends JpaRepository<Currencies, Integer>{

}
