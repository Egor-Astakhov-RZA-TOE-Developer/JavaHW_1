package ru.mpei.javaMetodichka;

import java.util.Scanner;

public class Task_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        for (int i=0; i < number.length(); i++){
            if (number.charAt(i) == '0'){
                System.out.println("Число содержит 0.");
                break;
            }
        }
    }
}
