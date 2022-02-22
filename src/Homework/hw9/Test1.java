package Homework.hw9;

public class Test1 {

    int a = 1;
    //static int a = 2; код не будет работать т.к. идентификаторы одинаковые у переменных

    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 ts1 = new Test1();
        ts1.abc(3);
    }
}
