package lesson7;


// пример модификатора доступа PUBLIC внутри класса и внутри файла все элементы видны
public class Employee {

    public double salary;
    private double salary2; // переменная доступна только внутри класса Employee и больше нигде

    double salary3; // default модификатор

     public void increaseEmployeeSalary(){
         double s = 100; // переменная только для метода. у неё не может быть модификатора доступа, они работают только внутри метода
        System.out.println(salary * 2);
    }

    private void increaseEmployeeSalary2(){ // метод доступен только внутри класса Employee и больше нигде
        System.out.println(salary2 * 2);
    }

   public Employee(double s) {
        salary = s;
    }

    /* private Employee(double s){
        salary = s;
    } */ //модификатор доступа private, конструктор доступен только внутри класса и больше нигде.
    // т.е. не получится создать объект класса за его пределами


    public static void main(String[] args) {
        Employee emp = new Employee(34.5);
        System.out.println(emp.salary);
        emp.increaseEmployeeSalary();
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        // если бы был модификатор доступа private то нельзя было бы создать объект, показать переменную и вызвать метод класса Employee
        Employee emp = new Employee(38.5);
        System.out.println(emp.salary);
        emp.increaseEmployeeSalary();

        emp.salary3 = 20; // доступен элемент, так как находится в одном и том же пакете


    }
}

