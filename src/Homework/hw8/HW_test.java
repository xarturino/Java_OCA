package Homework.hw8;

public class HW_test {
    public static void main(String[] args) {

        HW.division(6,4);
        HW.multiply(4,6,20);

        HW.multiply(1,5,8);
        HW.division(9,6);

        System.out.println("-------------------");

        HW.circumference(5.5); // т.к. статический и используется без создания объекта класса
        HW hw = new HW();
        hw.areaOfTheCircle(4.5);
        hw.circleInfo(7.8);
    }
}
