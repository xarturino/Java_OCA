package Homework.hw7_1;

import Homework.hw7.Employee;

public class Access_mod {
    public static void main(String[] args) {
        Employee emp = new Employee("fedorov");
        emp.viewId();
        emp.viewSalary();
        emp.viewSurname();

        // можем создать объект только с использованием одного типа конструктора. из-за мод. доступа
        // можем вызвать все методы но не сможем присвоить данные переменным айди и зп, из-за модификаторов
    }
}
