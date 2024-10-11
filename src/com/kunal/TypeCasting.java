package com.kunal;

public class TypeCasting {
    public static void main(String[] args) {
        //Type Casting
//        int num = (int) (67.89);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int n = 257;
//        byte b = (byte) (n);  // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 50;
//        byte b = 40; // Multiplication of a * b will give a byte value but 2000 is out of range of byte
//        int c = a * b; // this expression is evaluated using a and b as integer automatically
//        System.out.println(c);

//        byte a = 6;
//        a = a * 4; // here a * 4 is again being evaluated as integer and stored in a integer but above we have assigned
        // a as byte ; it is same as trying to convert float to integer
        int a = 'A';
        System.out.println(a); // 65
    }
}
