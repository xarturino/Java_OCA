package lesson9;

public class Student {
    public static int a = 10; // создана для урока 10

}


class StudentTest{


    // как заканчивается жизнь объекта

    /*
    * Garbage collector
    *
    * механизм который удаляет объекты из памяти компьютера
    *
    * мы можем определить какие объекты будут пригодны для того чтобы их GC собрал и удалил их
    * но не можем быть точно уверены что объект удалится !!!!!!!!!!!!!
    * контролировать GC невозможно, управление лежит на JVM
    *
    * */

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3; // просто переменная которая не имеет адреса ссылки на объект. объект не создаётся. т.к. нет вызова конструктора
        // единственный класс который может создать объект без конструктора это String
        String s = "hello";

        st1 = null; // в этом случае мы удаляем адрес. и разрываем связь с объектом. становится просто перем. с пустым адресом

        st2 = new Student(); // в таком случае адрес меняется, связь с объектом потеряна. появляется ссылка на другой новый объект

        // ещё один случай это когда область видимости заканчивается - объект перестаёт существовать.
    }
}