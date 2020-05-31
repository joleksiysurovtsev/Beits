package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        String name = "Кинжал";
        x = x * 17;
        System.out.println("x равен " + x);
        double d = Math.random();
        System.out.println(d);
        while (x > 12){
            x = x -1;
        }
        System.out.println(x);
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Теперь x = " + i);
        }
    }
}
