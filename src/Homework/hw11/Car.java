package Homework.hw11;

public class Car {

    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}



class CarTest{

    public static void changeDoorsNumber(Car car,int doors){
        System.out.println("Number of doors before " + car.doors);
        car.doors = doors;
        System.out.println("Now number of doors = " + doors);
    }

    public static void changeCarColours(Car car,Car car2){
        System.out.println("Cars colours are: Car1 " + car.color + " Car2 " + car2.color);
        String car3Colour = car.color;
        car.color = car2.color;
        car2.color = car3Colour;
        System.out.println("After swap: Car1 " + car.color + " Car2 " + car2.color);
    }


    public static void main(String[] args) {
        Car car = new Car("Black","V8", 4);
        changeDoorsNumber(car,8);
        Car car2 = new Car("Yellow", "W4",6);
        changeDoorsNumber(car2,4);
        changeCarColours(car,car2);
    }
}
