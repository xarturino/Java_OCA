/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

/**
 *
 * @author roman
 */
public class lesson3_3 {

    //сравнения > >= < <= == != 
    public static void main(String[] args) {
        int a = 3, b = 5, c = 5;
        // тип данных для операторов сравнения будет boolean а значит ответами на выражения будет либо true либо false
        boolean b1 = a > b; //больше
        boolean b2 = a >= b; // больше или равно
        boolean b3 = b <= c; // меньше либо равно
        boolean b4 = b < c; // меньше
        boolean b5 = a == c; // равно или нет
        boolean b6 = b == c;
        boolean b7 = a != b; // не равно
        boolean b8 = c != b;
        System.out.println(b1 + " " + b2);
        System.out.println(b3 + " " + b4);
        System.out.println(b5 + " " + b6);
        System.out.println(b5 + " " + b6);
        System.out.println(b7 + " " + b8);

    }
}
