package com.company;

public class Practical_07 {
    public static void main(String[] args) {
        int l1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int l2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int l3 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int d1 = (int)(Math.random() * 10);
        int d2 = (int)(Math.random() * 10);
        int d3 = (int)(Math.random() * 10);
        int d4 = (int)(Math.random() * 10);
        System.out.println("Your random numberplate is ");
        System.out.println("" + (char)(l1) + ((char)(l2)) +
                ((char)(l3)) + d1 + d2 + d3 + d4);
    }
}
