package lesson5;



public class Human {
    
    String name;
    Car3 car;
    BankAccount bankAccount;
    
    void info(){
        System.out.println("Name " + name + " Car color " + car.color + " Bank balance " + bankAccount.balance);
    }

}

class Car3 {

    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {

    BankAccount(int i, double b) {
        id = i;
        balance = b;
    }
    int id;
    double balance;
}


class HumanTest{
    public static void main(String[] args) {
        
        // придаём значения переменным ссылочного типа данных
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("yellow","v6");
        h.bankAccount = new BankAccount(22, 150.25);
        
        h.info();
    }
}