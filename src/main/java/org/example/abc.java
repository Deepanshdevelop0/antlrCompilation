package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class abc {

    public static void main(String[] args) {
        Collection<Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(10);
        arr.add(2);

        arr.stream().sorted();

        int i = 1;

        for (int a : arr) {
            System.out.println(i++ + " : " + a);
        }


    }

}
