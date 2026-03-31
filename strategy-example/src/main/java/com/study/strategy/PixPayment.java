package com.study.strategy;

public class PixPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento realizado via Pix: " + amount);
    }
}
