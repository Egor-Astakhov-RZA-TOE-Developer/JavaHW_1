package ru.mpei.javaMetodichka;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2_13 {
    public static void main(String[] args) {
        func13();
    }
    public static void func13() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        boolean restart = true;
        while (restart) {
            System.out.println("Введите желаемое число этажей: ");
            int countRooms = scanner.nextInt();
            Integer[] rooms = new Integer[countRooms];
            for (int i = 0; i < countRooms; i++) {
                rooms[i] = random.nextInt(10) + 1;
            }
            System.out.println("Секретный код: " + Arrays.toString(rooms));
            for (int j = 0; j < rooms.length; j++) {
                System.out.println("Перед вами 10 дверей. Выберите номер двери в которую хотите войти: ");
                int num = scanner.nextInt();
                if (num == rooms[j]) {
                    System.out.println("Вы выбрали верную комнату!");
                    counter++;
                } else {
                    System.out.println("Вы угодили в ловушку...");
                    break;
                }
            }
            if (counter == rooms.length) {
                System.out.println("Вы прошли подземелье! Поздравляем!");
                restart = false;
            } else {
                boolean f = true;
                while (f) {
                    System.out.println("Желаете попробовать ещё раз?\n 1 - Да. \n 2 - Нет.");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        f = false;
                    } else if (choice == 2) {
                        System.out.println("GAME OVER");
                        f = false;
                        restart = false;
                    } else {
                        System.out.println("Неправильная команда. Повторите попытку.");
                    }
                }
            }
        }
    }
}
