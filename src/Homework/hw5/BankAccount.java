
package Homework.hw5;

public class BankAccount {

    int id;
    String name;
    double balance;

    public BankAccount(int i, String s, double b) {
        id = i;
        name = s;
        balance = b;
        System.out.println("ID " + id + " Name " + name + " Balance " + balance);
    }

    //  непонятно почему в проверке домашнего задания используется метод с типом void
    double replenishmentBankAccount(double r) {
        balance += r;
        return balance;
    }

    double withdrawalBankAccount(double w) {
        balance -= w;
        return balance;
    }
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(313, "Alex Fedorov", 435.25);

        ba.replenishmentBankAccount(580.00);
        System.out.println("Current balance " + ba.balance);

        ba.withdrawalBankAccount(250.50);
        System.out.println("Current balance " + ba.balance);
    }
}
