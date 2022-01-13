package Homework.hw5;

public class Employee {

    int id, age;
    String surname, department;
    double salary, increaseSalary;

    Employee(int i, String s, int a, double sal, String d) {
        id = i;
        surname = s;
        age = a;
        salary = sal;
        department = d;
        System.out.println("Id " + id + " Surname " + surname + " Age " + age + " Salary " + salary + " Depart " + department);
    }

    double increaseImployeeSalary(double salary) {
        increaseSalary = salary * 2;
        return increaseSalary;
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Petrov", 37, 950.00, "QA");
        emp1.increaseImployeeSalary(emp1.salary);
        System.out.println("New salary is " + emp1.increaseSalary);

        Employee emp2 = new Employee(2, "Shevcov", 24, 1200.00, "Dev");
        emp2.increaseImployeeSalary(emp2.salary);
        System.out.println("New salary is " + emp2.increaseSalary);

    }
}
