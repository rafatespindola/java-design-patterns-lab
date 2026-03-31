package com.study.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento realizado via Cartão de crédito: " + amount);
    }
}
