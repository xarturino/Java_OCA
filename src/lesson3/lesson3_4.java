/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

/**
 *
 * @author roman
 */
public class lesson3_4 {

    //логические && || ! & |
    public static void main(String[] args) {

        //операторы И(&&) ИЛИ(||) работают с типом данных boolean
        //оператор И возвращает true только если все критерии равны true
        //оператор ИЛИ будет возвращать true если хотя бы один из критериев равен true 
        /*
        true && true && true  result true
        true && false && true  result false
        false && false && false  result false
        
        true || true || true  result true
        true || false || false  result true
        false || false || false  result false
         */
        boolean x = true, y = false, z = true, f = false;

        boolean result = x && y && z;
        System.out.println(result);
        boolean result2 = x && z;
        System.out.println(result2);

        boolean result3 = x || y || z;
        System.out.println(result3);
        boolean result4 = x || y || f;
        boolean result5 = y || f;
        System.out.println(result4 + " " + result5);

        //Short circuit операторы
        boolean a = false;
        boolean b = true;
        boolean c = a && b; // значение true у перем С никак не может быть, так как перем А - false
        boolean d = b || a; // тоже самое - раз хотя бы одна перем B - true, на вторую уже можно не смотреть
        int a1 = 10, b1 = 50, c1 = 0, d1 = 500;
        boolean c2 = a1 > b1 && c1++ == d1; //в данном случае перем С не увеличится на один потому что будет проверка только первой части неравенства
        System.out.println(c1);
        c1 = 99;
        boolean c3 = a1 > b1 || ++c1 == d1; // переменная С1 изменит значение на 100 и условие будет true
        System.out.println(c3 + " " + c1);
        boolean c4 = a1 < b1 || --c1 == d1; // C4 будет равно true, из-за первой части нерав., вторая выполняться не будет C1 не изменится
        System.out.println(c4 + " " + c1);

        //отрицание !
        boolean s = true;
        int v = 10, n = 5;
        boolean s1 = !(v < n); // ещё одна возможная запись отрицания
        System.out.println(!s + " " + s1);

        // битовые операторы & и |
        // используются в случае когда нам нужно в любом случае чтобы выполнилось второе условие
        /*boolean a = false;
        boolean b = true;
        boolean c4 = a1 < b1 || --c1 == d1; 
        System.out.println(c4 + " " + c1);
        как например здесь, даже не смотря на то что первый операнд false, переменная С1 изменит значение
         */
        int a2 = 10, b2 = 50, h2 = 99, d2 = 100;

        boolean e1 = a2 < b2 | ++h2 == d2;
        System.out.println(e1 + " " + h2);

        h2--;
        System.out.println(h2);
        boolean e2 = a2 > b2 & ++h2 == d2; // Перем. Е2 всё равно будет false, но значение перем h2 изменится
        System.out.println(e2 + " " + h2);

        // также могут работать с числами
        // при использовании операторы переводят число в двоичную систему, где 0 - false, а 1 - true
        int x1 = 10, y1 = 5;
        System.out.println(x1 & y1);// в бинарной системе 10 - 1010 и 5 - 101, при "сложении" получаем 0000  - false
        System.out.println(x1 | y1); // в бинарной системе при "сложении" получаем 1111 - true, в двоичной 15 

        //оператор ^ (битовый эксклюзивный оператор ИЛИ)
        // возращает true только если одно значение из всех равно true
        boolean g1 = true, g2 = true, g3 = true, g4 = true;
        System.out.println(g1 ^ g2 ^ g3 ^ g4); // вернёт false
        g1 = g2 = false;
        System.out.println(g1 ^ g2 ^ g3 ^ g4); // вернёт false
        g1 = g2 = g3 = false;
        System.out.println(g1 ^ g2 ^ g3 ^ g4); //вернёт true, потому что одна из них true
    }
}
