package Homework.hw10.p4;

import Homework.hw10.p1.*;
import Homework.hw10.p1.p2.p3.C;
import Homework.hw10.p4.p5.E;
import static Homework.hw10.p1.p2.B.model;



public class D {


    public static void main(String[] args) {

        // класс А
        A product = new A("Machine", 300);
        product.productInfo();

        // класс В
        System.out.println(model);

        // класс С
        C food = new C();
        food.countryFrom = "Angola";
        food.weight = 4.55;
        food.foodPrice = 5;
        food.foodInfo();

        // класс E

        E summary = new E();
        summary.summary(4, 6);


    }
}
