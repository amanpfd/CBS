package com.cg.cabbookingsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.Price;

@Repository
public interface PriceRepo extends JpaRepository<Price, Integer> {

}
