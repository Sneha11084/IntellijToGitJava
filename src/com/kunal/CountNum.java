package com.kunal;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int find = 5;
        int count = 0;
        while (num>0){
            int n = num % 10;
            if(n == find){
                count ++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}