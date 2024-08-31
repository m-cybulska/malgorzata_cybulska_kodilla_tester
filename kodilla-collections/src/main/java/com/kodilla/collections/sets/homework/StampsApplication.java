package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Penny Black",19, 22, false));
        stamps.add(new Stamp("Treskilling Yellow", 25, 32, true));
        stamps.add(new Stamp("Bull's Eye", 27, 30, false));
        stamps.add(new Stamp("Treskilling Yellow", 25, 32, true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
