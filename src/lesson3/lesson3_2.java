/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

/**
 *
 * @author roman
 */
public class lesson3_2 {

    public static void main(String[] args) {
        //присваивания = += -= *= /=

        // присваевание
        int a = 3; // переменной А присвается значение 3
        int b = 5;

        //увелич и уменьш присваемового значение
        int x = 5;
        x = x + 3; // значение переменной Х равно сумме значения переменной Х и числа 3 (5+3 = 8)  
        x += 3; // аналогичная запись верхнего выражения. Т.е сначала мы должны прибавить, а затем присвоить (8+3=11) новое значение Х число 11
        System.out.println(x);

        int y = 14;
        y -= 7;//сначала выполняем вычитание числа, а потом присваивание 14-7 = 7. Новое значение Y равно 7
        System.out.println(y);

        int z = 15;
        z *= 2;//сначала выполняем умножение числа, а потом присваивание 15*2 = 30. Новое значение Z равно 30
        System.out.println(z);

        int w = 7;
        w /= 2; // деление, затем присваивание. ВАЖНО - т.к. у нас int то новое значение перем W будет равно 3
        System.out.println(w);

        //множественное присваивание 
        a = b = x = y = z = w = 18; // вне зависимости от предыдущих значений, значения всех переменных будет равно 18
        System.out.println(a + " " + b + " " + x + " " + z + " " + w);

    }
}
