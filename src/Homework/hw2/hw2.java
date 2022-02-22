package Homework.hw2;

public class hw2 {

    // Создать по 4 переменные всех целочисленных типов данных и записать в разных системах исчесления, вывести на экран
    public static void main(String[] args) 
    {
        // тип данных байт
        byte b1 = 12;
        byte b2 = 0B1100; // двоичная
        byte b3 = 0_14; // 8-ричная
        byte b4 = 0XC; // 16-тиричная

        // тип данных short
        short s1 = 1300;
        short s2 = 0B0101_0001_0100;
        short s3 = 0_2424;
        short s4 = 0X514;

        // тип данных инт
        int i1 = 0;
        int i2 = 0B0;
        int i3 = 0_0;
        int i4 = 0X0;

        // тип данных long
        long l1 = 123456789L;
        long l2 = 0B0111_0101_1011_1100_1101_0001_0101L;
        long l3 = 0_726746425L;
        long l4 = 0X75BCD15L;

        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println(s1+ " " + s2+ " " + s3+ " " + s4);
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
        System.out.println("---------------------");
        
        
    // Создать по 2 переменные типа float, double и boolean, вывести на экран
    float f1 = 3.14F;
    float f2 = 45.14f;
    
    double d1 = 3.14d;
    double d2 = 888.4312;
    
    boolean bool1 = true;
    boolean bool2 = false;
    
    System.out.println(f1+ " " + f2+ " " + d1+ " " + d2);
    System.out.println(bool1 + " " + bool2);
    System.out.println("---------------------");
    
    // Создать n-ое количество переменных типа char всеми возможными способами
    char c1 = 'A';
    char c2 = '\u6754';
    char c3 = 43;
    
    System.out.println(c1 + " " + c2 + " " + c3);

    }
}
