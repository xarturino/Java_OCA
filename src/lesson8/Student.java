package lesson8;

import javax.crypto.spec.PSource;

public class Student {

    public String name;
    int course;
    public static int count;
    int a;// STATIC - переменная принадлежит всему классу, она общая для всех объектов созданных
    // к ней могут обращаться и изменять её любой объект класса, но внутри себя они не хранят её
    /*
    * Static могут быть и переменые и методы.
    * Основное свойство - принадлежат не объекту, а всему классу
    * !!!!!!!для того чтобы вызвать статическую перем или метод нам не нужно создавать объект класса
    * у статических переменных также дефолтные значения
    *
    * также часто используется сочетание static final. это значит что константа принадлежит всему классу и не может быть изменена
    *
    *
    * */

    public Student(String n, int c ) {
        count++;
        name = n;
        course = c;
        System.out.println("Student " + count + " is creating");
    }

    // пример статичного метода
    public static void showCount(){
        System.out.println("all creating students " + count);
    }

    public void showInfo(){
        System.out.println("Welcome");
    }

    void abc(){
        a++; // мы можем использовать не статичные переменные в нестатичных методах
        count++; // но также мы можем использовать статичные переменные в методе, потому что отношение идет к классу в целом, а не к объекту. потому что она полюбому уже существует
    }

    static void abcd(){ //может запускаться без объектов класса и можно увеличить в нем статичную переменную, она существует независимо от объектов
        count++;
        //a++; не статичная переменная не может использоваться в статичном методе. обязывает существовать объекта класса, т.к. у каждого объекта есть своя переменная
        // для того чобы обыграть это необходимо создать внутри метода объект и с помощщью объекта, у которого есть переменная - мы можем с ней работать
        Student st = new Student("John",1);
        st.a++;
    }

    public static void main(String[] args) {
        /*        // статический метод также можно вызвать и у него такие же свойства как у перем.
        Student st1 = new Student("Ivanov", 2);
        Student st2 = new Student("Petrov", 4);
        Student st3 = new Student("Danilov", 1);
        showCount(); */

        // мы можем вызывать внутри main без создания объекта статические методы
        abcd();
        // но не можем вызвать abc() так как он принадлежит конкретному объекту
        // метод main запускается в то время когда объектов не существует, поэтому abc нельзя вызвать без создания обзекта
        // создав объект мы можем сказать что abc принадлежит олбъекту
        Student st = new Student("Petr",1);
        st.abc();
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivanov", 2);
        Student st2 = new Student("Petrov", 4);
        Student st3 = new Student("Danilov", 1);

        //для того чтобы вызвать статическую перем или метод нам не нужно создавать объект, но обращение идёт от класса (запись как ниже если используется в другом классе)
        System.out.println(Student.count);
        // но мы также можем узнавать переменные относящиеся к объектам
        System.out.println(st1.count);

        // и также можно вызывать в другом классе, не создавая объекты данного класса/ обращение идёт используя имя класса
        Student.showCount();


    }
}
