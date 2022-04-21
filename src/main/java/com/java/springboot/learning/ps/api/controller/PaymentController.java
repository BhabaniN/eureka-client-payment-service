package com.java.springboot.learning.ps.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.java.springboot.learning.ps.api.service.PaymentService;
import com.java.springboot.learning.ps.api.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) throws JsonProcessingException {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) throws JsonProcessingException {
              return service.findPaymentHistoryByOrderId(orderId);
    }


}
