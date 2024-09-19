package ru.mpei.javaMetodichka;

import java.util.Arrays;

public class Task_2_7 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{7, 8, 9, 10};
        int[] arr3 = new int[]{11, 12, 13, 14, 15, 16};
        int[] arr4 = new int[]{17, 18, 19, 20, 21};


        int[] res = mergeArrays(arr1, arr2, arr3, arr4);

        System.out.println(Arrays.toString(res));
    }

    static private int[] mergeArrays(int[]... arrays){
        int resSize = 0;
        for (int[] arr: arrays) {
            resSize += arr.length;
        }
        int[] res = new int[resSize];
        int start = 0;

        for (int[] arr: arrays){
            for(int i = 0; i < arr.length; i++) {
                res[start + i] = arr[i];
            }
            start += arr.length;
        }

        return res;
    }
}
