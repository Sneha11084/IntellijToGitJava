package com.kunal;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);

//        Using Math.max()
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
