package com.company.mikhailova.Multithreading.Counters;

public class Counter {

    public Double count(double a) {
        for (int i = 0; i < 1000000; i++) {
            a = a + Math.sqrt(a);
        }

        return a;
    }
}
