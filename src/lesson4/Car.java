/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

/**
 *
 * @author roman
 */
public class Car {

    String color = "red";
    String engine = "V6";
}

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car3;// создаётся переменная но без ссылки на объект

        System.out.println(new Car().color);
        //создался новый объект, выводится цвет по дефолту. но этот объект мы больше не сможем использовать. т.к. нет адреса

        //конкотенация строк происходит через знак +
        System.out.println("Color: " + car1.color + " " + "Engine: " + car1.engine);

    }
}
