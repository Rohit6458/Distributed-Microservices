package com.example.orderservice.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OrderController {
    @Value("${message}")
    String message;

    @GetMapping("/order")
    public void getOrder() {
        System.out.println(message);
    }
}
