/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;

/**
 *
 * @author roman
 */
public class lesson3_6 {

    // взаимодействие данных с типом char
    public static void main(String[] args) {
        
        char a = 'a';
        int i = 10;
        System.out.println(a + i); 
        // в ответе получим 107, поскольку идёт сложение порядкового номера символа 'а' и числа 10. 97 + 10 = 107
        // можно выполнять любые арифмитические операции такие как деление, умножение, остаток
        // также можно присваивать порядковый номер типу данных int
        int b = 'a';// в данном случае перем b будет присвоено значение 97
        System.out.println(b);
    }

}
