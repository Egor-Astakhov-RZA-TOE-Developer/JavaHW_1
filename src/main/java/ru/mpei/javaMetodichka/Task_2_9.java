package ru.mpei.javaMetodichka;

import java.util.Arrays;

public class Task_2_9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int min = arr[0], max = arr[0], average = 0;

        for (int elem: arr){
            if (elem < min){
                min = elem;
            } else if (elem > max){
                max = elem;
            }
            average += elem;
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Минимальный элемент: %s \nМаксимальный элемент: %s \nСреднее значение: %s", min, max, average / arr.length);
    }
}
