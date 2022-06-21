package com.gb.microservices.limitsservice.controller;

import com.gb.microservices.limitsservice.controller.bean.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(1000, 1);
    }
}
