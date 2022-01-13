package Homework.hw4;

public class Student {

    int studentId;
    String name, surname;
    int yearOfStudy;
    double averageMath, averageEconomics, averageLang, averageResult;
}

class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "Ivan";
        student1.surname = "Petrov";
        student1.yearOfStudy = 2009;
        student1.averageMath = 4.2;
        student1.averageEconomics = 3.3;
        student1.averageLang = 5.0;
        student1.averageResult = (student1.averageMath + student1.averageEconomics + student1.averageLang) / 3;
        System.out.println("Average result of student: "  + student1.name + " " + student1.surname + " - "+ student1.averageResult);

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Petr";
        student2.surname = "Shevzov";
        student2.yearOfStudy = 2010;
        student2.averageMath = 2.6;
        student2.averageEconomics = 2.4;
        student2.averageLang = 4.7;
        student2.averageResult = (student2.averageMath + student2.averageEconomics + student2.averageLang) / 3;
        System.out.println("Average result of student: "  + student2.name + " " + student2.surname + " - "+ student2.averageResult);

        Student student3 = new Student();
        student3.studentId = 3;
        student3.name = "Alex";
        student3.surname = "Danilov";
        student3.yearOfStudy = 2013;
        student3.averageMath = 5.0;
        student3.averageEconomics = 5.0;
        student3.averageLang = 2.4;
        student3.averageResult = (student3.averageMath + student3.averageEconomics + student3.averageLang) / 3;
        System.out.println("Average result of student: "  + student3.name + " " + student3.surname + " - "+ student3.averageResult);
    }

}
