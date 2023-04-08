package com.practice.functional;

import com.practice.functional.dto.Student;
import com.practice.functional.dto.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        Consumer<String> stringConsumer = (s) -> System.out.println(s.toUpperCase());
        stringConsumer.accept("kalla");
        System.out.println("-----------printStudents-----------");
        printStudents();
        System.out.println("-----------printNAmeAndActivities-----------");
        printNAmeAndActivities();
        System.out.println("-----------printNameANdActivitiesUsingCondition-----------");
        printNameANdActivitiesUsingCondition();


    }

    private static void printNameANdActivitiesUsingCondition() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                c3.andThen(c4).accept(student);
            }
        }));
    }

    private static void printStudents() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    private static void printNAmeAndActivities() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); // consumer chaining
    }
}
