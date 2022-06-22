package com.gb.microservices.currencyexchangeservice.controller;

import com.gb.microservices.currencyexchangeservice.entity.ExchangeValue;
import com.gb.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);  //new ExchangeValue(100L, from, to, BigDecimal.valueOf(65));
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
