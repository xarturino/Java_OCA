package lesson8;

// FINAL может использоваться не только с примитивными типами данных, но и с ссылочными
public class Car{
    String color = "blue";
    String engine = "v56";

    // говорили о том что можно использовать такую запись но нужно будет определить перем. внутри каждого конструктора
    // public final int a; и задать её в конструкторе НОООО

    public static final int a = 10;
    // если константа является статиком мы должны определять её при создании, других вариантов нет. так как можем использовать не создавая объект


    public static void main(String[] args) {

        final Car car = new Car(); // адрес (значение) переменной не может быть изменён, переменная больше не может ссылаться на другой объект
        // при этом изменять элементы внутри объекта мы  можем
        car.color = "red";

        System.out.println(a);
    }
}
