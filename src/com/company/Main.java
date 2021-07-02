package com.company;

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

        //Write a program calculate the x values of the quadratic equation
        // (-b +- sqrt(b^2 - 4 * a * c)) / 2a
        // 2x^2 + 3x - 4 = 0
        // a      b    c

        // 1. Collect our input
        // 2. Solve for the discriminant
        // 3. find the first x value
        // 4. find the second x value
        // 5. output the result

        // Get user input from the console
        // initialize the scanner. Scanner class/object allows us to receive input from the user
        Scanner scanner = new Scanner(System.in);

        //Get value of a
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();

        //Get value of b
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();

        //Get value of c
        System.out.println("Enter the value of c: ");
        double c = scanner.nextDouble();

        //solve for the discriminant (b^2 - 4 * a * c)
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        //solve for the first value of x1
        //(-b + sqrt(discriminant)) / 2 * a
        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;

        //solve for the first value of x2
        //(-b - sqrt(discriminant)) / 2 * a
        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        //output the results
        System.out.println("The first value of x: " + x1);
        System.out.println("The second value of x " + x2);
    }

}
