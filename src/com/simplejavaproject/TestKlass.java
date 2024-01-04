package com.simplejavaproject;

public class TestKlass {
    public static void main(String[] args) {
        Klass1 klass1 = new Klass1("Hej, världen!");
        Klass2 klass2 = new Klass2(123);

        System.out.println(klass1.getMeddelande());
        System.out.println(klass2.getNummer());
    }
}


