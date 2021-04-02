package com.example.demo.controllers;

import com.example.demo.bean.DemoConfiguration;
import com.example.demo.java.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConfigurationController {
    private final Configuration configuration;

    @Autowired
    public DemoConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/demos")
    public DemoConfiguration retrieveDemos() {
        return new DemoConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
