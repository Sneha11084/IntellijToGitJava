package com.kunal;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char input = in.next().trim().charAt(0);
        if(input >= 65 && input <= 90) {  // or if(input >= 'A' && input <= 'Z')
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Lowercase");
        }
    }
}
