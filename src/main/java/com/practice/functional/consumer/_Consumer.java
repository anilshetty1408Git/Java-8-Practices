package com.practice.functional.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneName);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber)
            -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneName : "xxxxxxxx"));

    public static void main(String[] args) {
        System.out.println("//imperative way");
        Customer maria = new Customer("Maria", "8951271937");
        greetCustomer(maria);

        System.out.println("//Declarative way Consumer Functional interface");
        greetCustomerConsumer.accept(maria);

        System.out.println("//BiConsumer Functional interface");
        greetCustomerConsumerV2.accept(maria,false);

    }

    public static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneName);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneName;

        public Customer(String customerName, String customerPhoneName) {
            this.customerName = customerName;
            this.customerPhoneName = customerPhoneName;
        }
    }
}
