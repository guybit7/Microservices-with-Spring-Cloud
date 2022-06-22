package com.gb.microservices.currencyexchangeservice.repository;

import com.gb.microservices.currencyexchangeservice.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
