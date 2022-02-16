package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        increasing();

        double[] numbers = {20.3, -2.2, 34.3, 12.12, -54.3, 41.8, 4.197, -48.01, 9.9, -45.666, 8.80, 99.9, -11.1, 56.65, 32.7};
        boolean negative = false;
        double num = 0;
        int i = 0;

        for (double lol : numbers) {
            if (lol > 0 && negative) {
                System.out.println(lol);
                num = num + lol;
                i++;
            } else if (lol < 0) {
                negative = true;
            }
        }
        System.out.println(num / i); //300. 367 / 9 = 33.374111111111105
    }

    public static void increasing(){
        double[] numbers = {20.3, -2.2, 34.3, 12.12, -54.3, 41.8, 4.197, -48.01, 9.9, -45.666, 8.80, 99.9, -11.1, 56.65, 32.7};
        boolean sort = false;
        double buf;
        while(!sort){
            sort = true;
            for (int i = 0; i < numbers.length -1; i++) {
                if (numbers[i] > numbers[i + 1]){
                    sort = false;
                    buf = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}