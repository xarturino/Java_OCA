package lesson7;

// КОНТРОЛЛЕРЫ ДОСТУПА
// необходимы для сокрытия данных

//public - элементы класса будут видны для любого класса, и даже в классах других пакетов
//private - элементы класса будут видны только внутри своего класса
// (default) - существует всегда когда, модификатор не пишется. когда перед элементом не пишется модификатор его будут видеть только внутри пакета
// protected - связан с наследованием(ООП). элемент будет виден для всех классов пакета
//  +++ будет виден для детей класса с этим элементом (даже если классы находятся в других пакетах)

// у внешних классов модификаторы доступа могут быть public и default.
// у конструктора может быть любой модификатор доступа
// у переменной любой и у метода любой

public class Packages2 {

    public static void main(String[] args) {

        //в другом классе того же пакета все элементы видны
        // если бы был модификатор доступа private то нельзя было бы создать объект, показать переменную и вызвать метод класса Employee
        Employee emp = new Employee(34.5);
        System.out.println(emp.salary);
        emp.increaseEmployeeSalary();

        emp.salary3 = 20; // доступен элемент, так как находится в одном и том же пакете
    }
}
