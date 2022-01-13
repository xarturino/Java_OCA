/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 * ПЕРЕГРУЗКА МЕТОДОВ
 */
public class MethodOverloading {

    // таких методов может быть бесконечное множество и можно запутаться
    /*
    void showInt(int i1) {
        System.out.println(i1);
    }
    
    void showBoolean(boolean b1){
        System.out.println(b1);
    }
    
    void showString(String s1){
        System.out.println(s1);}*/
    //поэтому лучше объедиить их одним названием. отличия только в параметрах
    // но нельзя создать метод с одинаковым именем и параметрами (Перегруженные методы имеют одинак. имена и разный список параметров)
    // - разный по типам данным show(int a, String B)
    // - разный по количеству show(int a, int b, int c)
    // - разный по порядку show(int a, String b) и show(String b, int a) это разные методы 
    void show(int i1) { //нельзя создать например show(int b)
        System.out.println(i1);
        System.out.println("Data type INT");
    }

    //но такой метод уже создаётся
    void show(int a, int b) {
        System.out.println(a + b);
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type BOOLEAN");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type String");
    }

    // пример третьего правила(последовательность параметров)
    void show(String s, int a) {
        System.out.println("String " + s + " Int " + a);
    }
    
    void show(int a, String s){
        System.out.println("What a nice day");}

}

class MethodOverloadingTest {

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        mo.show(100);
        int a = 500;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Hello";
        mo.show(s);
        
        mo.show("Hello", 10);
        mo.show(15, "Jazz");
    }
}
