package com.practice.functional.supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDBConnectionUrlSupplierLists = () -> List.of("jdbc://localhost:5432/users","jdbc://localhost:5432/cust");

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    public static void main(String[] args) {
        System.out.println("normal supplier: "+getDBConnectionUrl());
        System.out.println("with supplier: "+getDBConnectionUrlSupplier.get());
        System.out.println("with supplier get list: "+getDBConnectionUrlSupplierLists.get());
    }
}
