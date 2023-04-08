package com.practice.imperativedeclarative;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 4, 6, 7, 5, 8, 9, 10);
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer i : list) {
            if (!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);

        // Declarative approach

        List<Integer> unique=  list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
