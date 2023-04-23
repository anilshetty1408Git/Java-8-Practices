package com.practice.functional.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.practice.functional.streams._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        //above are the result of below code
        /*people.stream()
                .map(personStringFunction)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;*/

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);
        //more action,.,.,.,..,.................

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);
        System.out.println("Contains only females: " + containsOnlyFemales);

        boolean containsAnyFemales = people.stream()
                .anyMatch(personPredicate);

        System.out.println("Contains any females: " + containsAnyFemales);
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
