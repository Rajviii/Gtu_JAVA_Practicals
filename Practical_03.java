package com.company;
import java.util.Scanner;
public class Practical_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number in meters : ");
        float meter = sc.nextFloat();
        System.out.print("Your number in feet : ");
        float feet = 3.28084f*meter;
        System.out.println(feet);
    }
}
