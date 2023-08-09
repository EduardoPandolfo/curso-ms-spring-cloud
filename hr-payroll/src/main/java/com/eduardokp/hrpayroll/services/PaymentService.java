package com.eduardokp.hrpayroll.services;

import com.eduardokp.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("bob", 1d, 1);
    }
}
