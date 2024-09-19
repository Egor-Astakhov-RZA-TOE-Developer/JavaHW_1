package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();


        System.out.println("Температура в фаренгейтах: " + tempToFahrenheit(temp));
    }

    private static double tempToFahrenheit(double tempInCelsia){
        return tempInCelsia * 1.8 + 32;
    }
}