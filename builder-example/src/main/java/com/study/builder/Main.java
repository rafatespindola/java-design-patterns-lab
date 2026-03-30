package com.study.builder;

public class Main {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .customerName("Rafael Teles")
                .product("Café")
                .size("G")
                .extraMilk(false)
                .observation("Sem açúcar por favor")
                .price(6.50)
                .build();

        System.out.println("Cliente: " + order.getCustomerName());
        System.out.println("Produto: " + order.getProduct());
        System.out.println("Tamanho: " + order.getSize());
        System.out.println("Leite extra: " + order.isExtraMilk());
        System.out.println("Observação: " + order.getObservation());
        System.out.println("Preço: R$ " + order.getPrice());
    }
}