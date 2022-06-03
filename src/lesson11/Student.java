package lesson11;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.course = course;
        this.grade = grade;
        this.name = name;
    }

    /*
    * после выполнения метода, студенты не поменяются, потому что локальные для метода переменные s3, s1, s2 перестанут существовать
    * вне метода, а параметры останутся неизменными st1, st2
    *
    * */
    public static void swap(Student s1, Student s2){ // когда в параметр ставится ссылочный тип данных, то ставится не он сам, а его копия!!!
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }


    // с помощью методов мы можем менять значения, но не можем изменить ссылки
    public static void changeName(Student s1){
        s1.name = "Paul";
    }


    public static void main(String[] args) {
        Student st1 = new Student("Walt",2,5.2);
        Student st2 = new Student("Smith", 1,8.7);

        swap(st1,st2); // получается фейковый метод
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        // что происходит в методе:
        /*
        * в параметр попадает копия st2 (st2*) внутри метода у копии меняется имя
        * в параметр передаётся новое имя, копия перестаёт существовать, но у объекта новое имя
        * */
        System.out.println(st2.name);
    }
}
