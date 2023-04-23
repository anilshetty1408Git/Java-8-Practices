package com.practice.functional.optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Object value = Optional.of("Hello")
                .orElseGet(() -> "default value");
        System.out.println(value);

        System.out.println("//Example 1");

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.empty()
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );

    }
}
