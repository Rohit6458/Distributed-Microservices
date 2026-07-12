package com.example.Logger_1.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PaymentController {

    Logger log= LoggerFactory.getLogger(PaymentController.class);

    @GetMapping("/getPayment")
    public String getPayment() {
        log.info("Payment Details");
        log.debug("Payment Details service");
        return "Payment Details";
    }
}
