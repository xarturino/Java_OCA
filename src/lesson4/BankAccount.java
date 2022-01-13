package lesson4;

//класс шаблон с атрибутами
public class BankAccount {

    //атрибуты класса, инстанс переменные, относятся к каждому созданному объекту класса
    int id;
    String name;
    double balance;
    // также можно присваивать значения переменным сразу. тогда эти значения станут дефолтными

}

class BankAccountTest {

    public static void main(String[] args) {

        // создание объекта класса
        //ЛЮБОЙ КЛАСС это ссылочный тип данных.
        BankAccount MyAccount = new BankAccount(); // тип данных -> имя переменной -> вызов конструктора(создание объекта)
        // new означает что будет создаваться новый объект класса BankAccount
        // выражение new BankAccount() означает что объект в области памяти
        // ba переменная не содержит объект, а содержит адрес по которому можно найти объект
        // у каждого класса должен быть конструктор для создания объекта

        BankAccount HisAccount = new BankAccount(); // создание нового объекта, адрес присвоен переменной HisAccount
        BankAccount YourAccount = new BankAccount(); // создание нового объекта, адрес присвоен переменной YourAccount

        MyAccount.id = 1; // присвоение значения переменной id типа int для объекта MyAccount
        MyAccount.name = "Roman"; // присвоение значения переменной name типа String для объекта MyAccount
        MyAccount.balance = 12.35; //присвоение значения переменной balance типа double для объекта MyAccount

        System.out.println(MyAccount.name);

        System.out.println(YourAccount.balance);// выведет дефолтное значение 0.0
        System.out.println(YourAccount.name);//выведет NULL - дефолтное значение для ссылочных типах данных

        //присвоение значений переменным объекта HisAccount
        HisAccount.id = 2;
        HisAccount.name = "Ivan";
        HisAccount.balance = 123.24;
        
        //присвоение адреса ссылочной переменной
        int a = 5; int b = a; //мы присвоили значение переменной А также и  переменной B
        
        BankAccount BA = new BankAccount();
        BA.name = "Pavel"; // присвоение значения переменной name для объекта
        
        BankAccount BA2 = BA; // перем BA2 присваивается адрес переменной BA (НОВЫЙ ОБЪЕКТ НЕ СОЗДАЁТСЯ)
        System.out.println(BA2.name); // получим имя Павел, т.к. ссылается на один и тот же объект
        
    }
}
