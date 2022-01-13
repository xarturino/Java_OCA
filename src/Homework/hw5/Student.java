/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.hw5;

public class Student {

    int studentId;
    String name, surname;
    int course;
    double averageMath, averageEconomics, averageLang, averageResult;

    Student(int i, String n, String s, int c, double am, double ae, double aL) {
        studentId = i;
        name = n;
        surname = s;
        course = c;
        averageMath = am;
        averageEconomics = ae;
        averageLang = aL;
        System.out.println("ID " + studentId + " Name " + name + " " + surname + " Course " + course);
        System.out.println("Math " + averageMath + " Economics " + averageEconomics + " Language " + averageLang);
    }

    void averageResult() {
        averageResult = (averageMath + averageEconomics + averageLang)/3;
        System.out.println("Average result is " + averageResult);
        System.out.println("-------");
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Ivan", "Petrov", 2, 4.2, 3.3, 5.0);
        student1.averageResult();

        Student student2 = new Student(2, "Petr", "Shevzov", 1, 2.6, 2.4, 4.7);
        student2.averageResult();

        Student student3 = new Student(3, "Alex", "Danilov", 2, 5.0, 5.0, 2.4);
        student3.averageResult();
    }

}
