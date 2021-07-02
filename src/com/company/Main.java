package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Alternative solution
        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
                continue;
            } else {
                System.out.println(i);
            }
        }

    }

}


