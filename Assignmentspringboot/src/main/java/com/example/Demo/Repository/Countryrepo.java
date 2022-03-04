package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.model.Countries;
@Repository
public interface Countryrepo extends JpaRepository<Countries, Integer> {

}
