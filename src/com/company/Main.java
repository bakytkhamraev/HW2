package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 5, 6, 7, 89};
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
        numbers[3] = 90;
        System.out.println(numbers[3]);

        String names[] = new String[3];
        names[0] = "Bakyt";
        names[1] = "Bakyt1";
        names[2] = "Bakyt3";
        System.out.println("vvtdite index 6-10:");
        /*Scanner s =new Scanner (System.in);
        System.out.println(names[s.nextInt()]);*/

        int[][] arr = {{1, 55}, {4, 7}, {9, -7}};
        System.out.println(arr[0][1]);

        for (int i = 1; i <= 5; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "x7=" + (i * 7));

            {
            }
            int i = 1;

            while (i <= 9) {
                System.out.println(i + "x5=" + (i * 5));
                i = +1;
            }
            while (true) {
                System.out.println("hello");
            }
        }
    }
}
