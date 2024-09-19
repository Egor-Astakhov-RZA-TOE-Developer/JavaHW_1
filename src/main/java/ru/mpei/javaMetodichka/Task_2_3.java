package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("\n%10s",Math.pow(2, i));

        }
    }
}
