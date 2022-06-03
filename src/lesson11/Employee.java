package lesson11;

/*
*Аргументы методов
*
* когда используется примитивный тип данных в параметре метода, будет использоваться не сама переменная а её значение
*
* могут быть : примитивные, ссылочные
*
*
* */
public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    public double increase(double a){
        a = a*2;
        return a;
    }

    public double increaseSecond(){
        salary = salary * 2;
        return salary;
    }
}


class EmployeeTest{

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 135.5);
        double d = emp1.increase(emp1.salary); // подставляется в метод только значение
        System.out.println(d); // 271
        System.out.println(emp1.salary); // 135 // параметр зарплаты не меняется после выполнения метода, меняется только значение перем. double

        emp1.increaseSecond();
        System.out.println(emp1.salary);
    }
}
