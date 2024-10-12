package com.kunal;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//      for loops
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        for (int n = 1; n <= num; n++) {
//            System.out.print(n + " ");

//      while loops
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int n = 1;
//        while(n<=num) {
//            System.out.println(n);
//            n+=1;
//        }

//      do while loops
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = 1;
        do {
            System.out.println(n);
            n+=1;
        } while (n<=num);
    }
}
