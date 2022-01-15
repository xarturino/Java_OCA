package Homework.hw6;

public class Student {

    int studentId;
    String name, surname;
    int course;
    double averageMath, averageEconomics, averageLang;

    // первый конструктор со всеми параметрами был сделан в hw5
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

    Student(int i, String n, String s,int c){
        this(i,n,s,c,0.0,0.0,0.0);
    }

    Student(){
        this(0,null,null,0,0.0,0.0,0.0);
    }
}

class StudentTest {

    // метод создается в классе, а не в методе main
    double averageResult(Student s){
        double averageResult = (s.averageMath + s.averageEconomics + s.averageLang)/3;
        System.out.println("Average result is " + averageResult);
        return averageResult;
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Ivan", "Petrov", 2, 4.2, 3.3, 5.0);
        StudentTest st = new StudentTest();
        st.averageResult(s1);

        Student s2 = new Student(1,"Petr","Sidorov",2);

        Student s3 = new Student();
    }

}