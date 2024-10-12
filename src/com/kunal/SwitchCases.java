package com.kunal;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//      if case is mango then it directly jumps onto the mango case and doesn't check for others like the if statements does
//      if we don't put break after every case then it will execute all the case until it finds a break statement
//      if we put default in somewhere middle then we have to put a beak statement with it too
//      duplicate cases are not allowed
//        switch (fruit) {
//            case "Apple" -> System.out.println("Sweet red fruit");
//            case "Mango" -> System.out.println("Sweet yellow fruit");
//            case "Orange" -> System.out.println("Sweet Orange fruit");
//            case "Grapes" -> System.out.println("Sweet small fruit");
//            case "Kunal" -> System.out.println("My favourite fruit");
//            default -> System.out.println("Invalid input");
//        }

//      when we don't need to put the break condition
        int n = in.nextInt();
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid input");
        }
    }
}
