package Homework.hw7;

public class Employee {

    //приватная переменная (доступна только в этом классе)
    private double salary;

    // публичная переменная (доступна везде)
    public String surname;

    // дефолтный модификатор доступа (перемен доступна только внутри пакета)
    int id;

    // 3 публичных метода
    public void viewSalary(){
        System.out.println(salary);
    }

    public void viewSurname(){
        System.out.println(surname);
    }

    public void viewId(){
        System.out.println(id);
    }

    // 3 конструктора с разными модификаторами доступа
    Employee(int i, String s){
        surname =s;
        id = i;
    }

    public Employee(String s){
        surname = s;
    }

    private Employee(int i, String s, double sal){
        id = i;
        surname = s;
        salary = sal;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"renatov", 23.50);
        emp.viewId();
        emp.viewSalary();
        emp.viewSurname();
    }
}
