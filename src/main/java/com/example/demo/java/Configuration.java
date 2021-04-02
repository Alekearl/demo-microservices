package com.example.demo.java;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("demo-microservices-app")
public class Configuration {
    private int maximum;
    private int minimum;
}
