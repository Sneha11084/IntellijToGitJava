package com.kunal;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String dep = in.next();
        switch (empid){
            case 1 -> System.out.println("Sneha Verma");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Emp id is 3");
                switch (dep) {
                    case "IT" -> System.out.println("Department is IT");
                    case "Management" -> System.out.println("Department is Management");
                    default -> System.out.println("No department specified");
                }
            }
            default -> System.out.println("Invalid input");
        }
    }
}
