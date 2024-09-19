package ru.mpei.javaMetodichka;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_10 {
    private static final String[] MONTH_NAMES = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNumber;
        do {
            System.out.print("Введите номер месяца (от 1 до 12): ");
            monthNumber = sc.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Неверный номер месяца. Пожалуйста, введите число от 1 до 12.");
            }
        } while (monthNumber < 1 || monthNumber > 12);

        String monthName = MONTH_NAMES[monthNumber - 1];
        int seasonNumber = (monthNumber % 12) / 3;
        String seasonName;
        if (seasonNumber == 0) seasonName = "Зима";
        else if (seasonNumber == 1) seasonName = "Весна";
        else if (seasonNumber == 2) seasonName = "Лето";
        else seasonName = "Осень";

        System.out.printf("Месяц: %s \nВремя года: %s", monthName, seasonName);
    }
}
