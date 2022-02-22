package Homework.hw9;

public class Test2 {

    int a = 2;
    static int b = 1;

    static void abc(final int a){
        System.out.println(a);
        //System.out.println(this.a); код не будет работать т.к. переменная может быть инициализирована до создания объекта класса
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.abc(4);
    }
}
