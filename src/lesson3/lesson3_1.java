
package lesson3;

public class lesson3_1 {
    //арифмитические + - / * ++ -- %

    public static void main(String[] args) {

        //Сложение и вычитание
        int a = 5, b = 10;

        int c = a + b;
        int c1 = b - a;

        System.out.println(a + b);
        System.out.println(c);
        System.out.println(b - a);
        System.out.println(c1);

        //Умножение
        int c2 = a * b;
        System.out.println(c2); // = a * b

        //Деление
        int a1 = 10, b1 = 3;
        int c3 = a1 / b1; // результат деление 3.333333 но у нас INT поэтому только 3, дробная часть отсекается
        System.out.println(c3);

        double a2 = 11, b2 = 3;
        double c4 = a2 / b2;
        System.out.println(c4);  //результат деления с дробной частью потому что double тип данных

        // Остаток от деления
        int a3 = 11, b3 = 3;
        int c5 = a3 / b3;
        int c6 = a3 % b3;
        System.out.println(c5 + "  " + c6);

        double d = 5.5, e = 3.5;
        double f = d % e;
        double f1 = d / e;
        System.out.println(f + " " + f1);

        //Унарные операторы (++ --)
        int x = 5, y = 3;
        int z = x - y; // ответ равен 2
        int z1 = x - y++; // ответ также равен 2, но значение переменной Y станет равно 4 (Y++ в этом случае будет постфикс)
        // в выражении выше сначала выполняется вычитание и мы получаем значение перем Z1 а после этого Y увелич на 1 (становится 4)

        int z2 = x - ++y; // в данном случае вычитается уже увеличенное значение Y т.е. 5 - 5 (т.к. после прошлой операции Y = 4)
        System.out.println(z + " " + z1 + " " + y + " " + z2);

        // Аналогичная ситуация с --
        int x1 = 10, y1 = 5;
        int z3 = --x1 - y1; // Сначала уменьшаем значение X на 1 (10-1) а после отнимает Y . Перем Z3 будет равна 4
        System.out.println(z3);
        
        int z4 = x1-- - y1; //После предыдущей операции Х1 равен 9, поэтому Z4 = 4, но значение переменной Х1 будет равно 8
        System.out.println(z4 + " " + x1);
        
        
        int k = 5;
        int t = ++k - --k - k-- + k++; //6 - 5 - 5 + 4 = 0 , значение переменной k после операции равно 5
        System.out.println(t + " " + k);
    }
}
