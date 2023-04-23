package com.practice.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.practice.functional.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", FEMALE)
                );

        //Imperative approach
        System.out.println("//Imperative approach");

        List<Person> females = new ArrayList<>();
        for(Person person:people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person person: females){
            System.out.println("females: "+person);
        }

        //Declarative approach
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        System.out.println("// Declarative approach");
        people.stream().filter(personPredicate).toList().forEach(System.out::println);
    }

    enum Gender {
        MALE, FEMALE
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
