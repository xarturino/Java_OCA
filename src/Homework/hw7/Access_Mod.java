package Homework.hw7;

public class Access_Mod {

    public static void main(String[] args) {

        Employee emp = new Employee(1,"semenow");
        emp.viewSurname();
        emp.viewSalary();
        emp.viewId();
        // мы можем вызвать метод про зарплату, но не можем вызвать конструктор и не можем указать зарплату, т.к. она приватная
    }
}
