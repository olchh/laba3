package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println(i + "*" + y + "=" + i * y);
            }
            System.out.println();
        }
    }
}