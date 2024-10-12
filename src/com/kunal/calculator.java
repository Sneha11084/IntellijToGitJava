package com.kunal;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter operator or enter X or x to exit the program:");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '%' || op == '/'){
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+'){
                    System.out.println(num1 + num2);
                }
                if(op == '-'){
                    System.out.println(num1 - num2);
                }
                if(op == '*'){
                    System.out.println(num1 * num2);
                }
                if(op == '%'){
                    if(num2 != 0){
                        System.out.println(num1 % num2);
                    }
                }
                if(op == '/'){
                    if(num2 != 0){
                        System.out.println(num1 / num2);
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
}
