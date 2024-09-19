package ru.mpei.javaMetodichka;

public class Task_2_4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 0, 5, 0, 4, 7, 8, 0, 9, 10};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
