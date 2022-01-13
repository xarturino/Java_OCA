/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author roman
 */
public class Test {

    int id, age;
    String surname, department;
    double salary, increaseSalary;

    int sum(int a, int b, int c) {
        int result = a + b + c;
        return a + b + c;
    }

    int average(int x, int y, int z) {
        // return (a+b+c)/3; // можно было бы писать так
        // но можно было воспользоваться кодом который уже был написан. вызвав метод
        return sum(x, y, z) / 3;
    }

    ///!!!ПОДРОБНЫЙ ПРИМЕР В Employee
    //Правильное написание конструкторов заключается в написании конструкторов от того где больше всего параметров к меньшему
    Test(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    Test(int id2, String surname2, int age2) {

        this(id2, surname2, age2, 0.0, null); // для двух параметров которых нет в конструкторе мы ставим дефолтные значения
    }

    Test(String surname3, int age3) {

        this(0, surname3, age3, 0.0, null);
    }
}
