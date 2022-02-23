package Homework.hw10.p1;

public class A {

    String category;
    int price;

    public A(String category, int price){
        this.category = category;
        this.price = price;
    }

    public void productInfo(){
        System.out.println(this.category + " " + this.price);
    }
}
