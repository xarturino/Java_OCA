/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

/**
 *
 * @author roman
 */
public class lesson3_5 {

    //правила выполнения действий
    public static void main(String[] args) {
        int a = 10, b = 3;
        int c = ++a - b * 2; // увеличивается перем А, затем умножается перем B затем вычитание 11-6 =5
        System.out.println(c);

        c = (a-- - b) * 2;//выполняется сначало уменьшение А(но не влияет на функцию) затем вычитание, затем умнож - результат (11 - 3)*2 = 16
        System.out.println(c + " " + a);

        //логические операторы имеют одинаковый приоритет и выполняются последовательно
    }
}
