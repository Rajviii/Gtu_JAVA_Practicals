package com.company;

public class Practical_02 {
    public static void main(String[] args) {
        //ax + by = e ,        cx + dy = f
        //3.4x + 50.2y = 44.5  2.1x + 55y = 5.9
        System.out.println("our values are as mentioned below");
        float a = 3.4f;
        float b = 50.2f;
        float c = 2.1f;
        float d = 0.55f;
        float e = 44.5f;
        float f = 5.9f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.print("x : ");
        float x = (e*d - b*f)/(a*d - b*c);
        System.out.println(x);
        System.out.print("y : ");
        float y = (a*f - e*c)/(a*d - b*c);
        System.out.println(y);
    }
}
