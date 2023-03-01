package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner doublemath=new Scanner(System.in);
        double a=doublemath.nextDouble(),b=doublemath.nextDouble();
        System.out.println(Math.pow(a,b));
    }
}