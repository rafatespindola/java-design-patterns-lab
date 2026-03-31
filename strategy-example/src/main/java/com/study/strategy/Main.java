package com.study.strategy;

public class Main {
    static void main(String[] args) {

        PaymentStrategy pix = new PixPayment();
        PaymentStrategy creditCard = new CreditCardPayment();

        PaymentService paymentServicePix = new PaymentService(pix);
        PaymentService paymentServiceCreditCard = new PaymentService(creditCard);

        paymentServicePix.processPayment(25.0);
        paymentServiceCreditCard.processPayment(55.0);

    }
}
