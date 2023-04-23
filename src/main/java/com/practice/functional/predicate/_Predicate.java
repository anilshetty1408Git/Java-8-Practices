package com.practice.functional.predicate;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static  Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println("??With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000300"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("09000000300"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("09000000300"));


    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

}
