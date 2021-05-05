package com.company;
import java.util.Scanner;
public class Practical_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter : ");
        char ch = sc.next().charAt(0);
        switch(Character.toLowerCase(ch)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Entered letter is vowel");
                break;
            default:
                System.out.print("Entered letter is constant");
        }
    }
}
