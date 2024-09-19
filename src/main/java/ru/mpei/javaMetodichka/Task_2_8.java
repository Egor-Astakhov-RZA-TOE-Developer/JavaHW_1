package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку -> ");
        String str = sc.nextLine();
//        String str = strInitial.split(" ").s

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println("Строка не является палиндромом.");
                break;
            }
            if ( i == str.length()/2 -1) System.out.println("Переданная строка - палиндром.");
        }

    }
}
