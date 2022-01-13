/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

/*
пример ситуации с двумя main классами в файле. Выполнятся будет только один из них, который будет выбран.
второй будет игнорироваться.
при запуске через консоль первым бы выполнялись действия из PUBLIC класса
 */
public class lesson4_3 {
    public static void main(String[] args) {
        System.out.println("Welcome to the first main");
    }
}

class lesson4_3a{
    public static void main(String[] args) {
        System.out.println("Welcome to the second main");
    }
}
