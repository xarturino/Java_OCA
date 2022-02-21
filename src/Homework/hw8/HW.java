package Homework.hw8;

public class HW {

    // первая часть домашнего задания

    static int multiply(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void division(int a, int b) {
        int r = a / b;
        int s = a % b;
        System.out.println("Division result = " + r + ", remainder = " + s);
    }

    // вторая часть домашнего задания

    final static double P = 3.14;

    void areaOfTheCircle(double radius){
        double area = P * radius * radius;
        System.out.println("Area is: " + area);
    }

    static void circumference(double radius){
        double circumference = 2 * P * radius;
        System.out.println("Circle length is: " + circumference);
    }

    void circleInfo(double radius){
        double r = radius;
        System.out.println("Radius is: " + r);
        areaOfTheCircle(r);
        circumference(r);
    }
}


