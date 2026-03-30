package com.study.builder;

public class Order {
    private String customerName;
    private String product;
    private String size;
    private boolean extraMilk;
    private String observation;
    private double price;

    private Order(Builder builder) {
        this.customerName = builder.customerName;
        this.product = builder.product;
        this.size = builder.size;
        this.extraMilk = builder.extraMilk;
        this.observation = builder.observation;
        this.price = builder.price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public String getSize() {
        return size;
    }

    public boolean isExtraMilk() {
        return extraMilk;
    }

    public String getObservation() {
        return observation;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String customerName;
        private String product;
        private String size;
        private boolean extraMilk;
        private String observation;
        private double price;

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder extraMilk(boolean extraMilk) {
            this.extraMilk = extraMilk;
            return this;
        }

        public Builder observation(String observation) {
            this.observation = observation;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Order build() {
            validate();
            return new Order(this);
        }

        private void validate() {
            if (customerName == null || customerName.isBlank()) {
                throw new IllegalArgumentException("Customer name is required.");
            }

            if (product == null || product.isBlank()) {
                throw new IllegalArgumentException(("Product is required"));
            }

            if (size == null || size.isBlank()) {
                throw new IllegalArgumentException("Size is required");
            }

            if (price <= 0) {
                throw new IllegalArgumentException("Price must be greater than zero");
            }
        }
    }
}
