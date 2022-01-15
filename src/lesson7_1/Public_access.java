package lesson7_1;

import lesson7.Employee;

public class Public_access {
    public static void main(String[] args) {

        //проверка доступности public элементов из пакета lesson7 класс Employee

        // если бы был модификатор доступа private то нельзя было бы создать объект, показать переменную и вызвать метод класса Employee
        lesson7.Employee emp = new Employee(454.20);
        System.out.println(emp.salary);
        emp.increaseEmployeeSalary();

        // emp.salary3 = 20; // недоступен элемент, так как находится в другом пакете
    }
}
