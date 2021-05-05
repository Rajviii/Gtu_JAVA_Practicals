package com.company;
import java.util.Scanner;
public class Practical_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in Pound : ");
        double Pound = sc.nextDouble();
        System.out.print("Your weight in Kg : ");
        double Kg = 0.45359237d*Pound;
        System.out.println(Kg);

        System.out.print("Enter your height in Inch : ");
        double Inch = sc.nextDouble();
        System.out.print("Your height in Meter : ");
        double Meter = 0.0254d*Inch;
        System.out.println(Meter);

        System.out.print("Your BMI is : ");
        double BMI = Kg/(Meter) * (Meter);
        System.out.println(BMI);
    }
}
