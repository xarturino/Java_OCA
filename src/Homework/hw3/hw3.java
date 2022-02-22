/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.hw3;

/**
 *
 * @author roman
 */
public class hw3 {

    public static void main(String[] args) {

        //вычислить результат
        int i1 = 5, i2 = 11;
        double d1 = 5.5, d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l; // 2 + 1.3 - 20 = -16.7
        System.out.println(result);

        // чему равны выражения
        int a = 5, b = 8;
        int c1;
        int c2;
        c1 = a-- - --a + ++a + a++ + a; // 5 - 3 + 4 + 4 + 5 = 15
        c2 = ++b - b++ + ++b - --b; // 9 - 9 + 11 - 10 = 1
        System.out.println(c1 + " " + c2);
    }

}
