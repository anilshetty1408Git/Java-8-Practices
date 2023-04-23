package com.practice.functional.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "+058745555", LocalDate.of(2015, 1, 1));

        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer db

        // Using combinator pattern

        CustomerRegistrationValidator.ValidationResult result =CustomerRegistrationValidator.isEmailVaid().
                and(CustomerRegistrationValidator.isPhoneNumberVaid()).
                and(CustomerRegistrationValidator.isAdult()).apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
