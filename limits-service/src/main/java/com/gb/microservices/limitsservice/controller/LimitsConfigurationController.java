package com.gb.microservices.limitsservice.controller;

import com.gb.microservices.limitsservice.bean.LimitsConfiguration;
import com.gb.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        System.out.println("limits!");
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
