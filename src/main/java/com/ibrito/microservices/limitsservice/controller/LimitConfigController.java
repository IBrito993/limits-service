package com.ibrito.microservices.limitsservice.controller;

import com.ibrito.microservices.limitsservice.bean.LimitConfiguration;
import com.ibrito.microservices.limitsservice.config.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
@RequiredArgsConstructor
public class LimitConfigController {

    private final Configuration configuration;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LimitConfiguration> retrieveLimits() {
        return ResponseEntity.status(HttpStatus.CREATED).body(LimitConfiguration.builder().maximun(configuration.getMaximum()).minimun(configuration.getMinimum()).build());

    }
}
