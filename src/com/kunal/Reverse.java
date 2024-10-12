package com.kunal;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;
        while (num > 0){
            int n = num % 10;
            reverse = reverse * 10 + n;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
