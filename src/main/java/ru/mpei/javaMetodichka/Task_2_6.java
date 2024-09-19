package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numStr = Integer.toString(number);

        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < numStr.length(); i++) {
            if (i != numStr.length() - 1){
                str.append(numStr.charAt(i)).append(", ");
            } else str.append(numStr.charAt(i)).append("]");
        }

        System.out.println(str);
    }
}
