package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0 ; i--){
            System.out.println(str.charAt(i));
        }
    }
}
