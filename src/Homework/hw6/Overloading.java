package Homework.hw6;

public class Overloading {

    int sum(int a, int b, int c, int d){
        int sum = a + b + c + d;
        System.out.println("sum is " + sum);
        return sum;
    }

    int sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("sum is " + sum);
        return sum;
    }

    int sum(int a, int b){
        int sum = a + b;
        System.out.println("sum is " + sum);
        return sum;
    }

    int sum(int a){
        int sum = a;
        System.out.println("sum is " + sum);
        return sum;
    }

    int sum(){
        int sum = 0;
        System.out.println("sum is " + sum);
        return sum;
    }
}

class OverloadingTest{

    public static void main(String[] args) {

        Overloading ov = new Overloading();
        ov.sum();
        ov.sum(4);
        ov.sum(4,6);
        ov.sum(3,9,12);
        ov.sum(7,0,16,144);
    }
}
