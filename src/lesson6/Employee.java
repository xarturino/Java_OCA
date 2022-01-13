/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * ПЕРЕГРУЗКА КОНСТРУКТОРОВ
 *
 * перегруженные конструкторы имеют разный список параметров - одинаковые имена
 * обязательно - список параметров может быть: - разный по типу данных - разный
 * по количеству - разный по порядку - access modifier может быть разным или
 * одинаковым - конструкторы с отличием только access modifier не являются
 * перегруженными (ошибка)
 */
public class Employee {

    int id, age;
    String surname, department;
    double salary, increaseSalary;

    Employee(int id2, String surname2, int age2) {
        this(surname2, age2); // ключевое слово THIS показывает что мы вызываем конструктор внутри конструктора
        // какой именно конструктор вызывается будет понятно из набора параметров
        id = id2;
    }

    Employee(String surname3, int age3) {
        // как можно не писать этот код постоянно? а вызвать конструктор с этими значениями чтобы избежать копипаста
        // используя шаблон конструктора - пример выше
        // конструктор не может вызывать внутри тела свой перегруженный конструктор по имени класса (ошибка)
        age = age3;
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this(id4, surname4, age4); // THIS выражение должно быть первым в теле конструктора!!!! в этом конструкторе можно уже использовать 3 параметра
        salary = salary4;
        department = department4;
    }
    
    //ПРАВИЛЬНОЕ НАПИСАНИЕ КОНСТРУКТОРОВ с использование THIS будет в TEST
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.id);

        Employee emp2 = new Employee("Petrov", 40);
        System.out.println(emp2.age);

        Employee emp3 = new Employee(3, "Sidorov", 18, 450.00, "IT");
        System.out.println(emp3.department);
    }
}
