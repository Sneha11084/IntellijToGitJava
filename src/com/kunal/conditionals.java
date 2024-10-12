package com.kunal;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if (salary>20000) {
            System.out.println(salary+3000);
        }
        else if(salary>10000){
            System.out.println(salary+2000);
        }
        else {
            System.out.println(salary+1000);
        }
    }
}
