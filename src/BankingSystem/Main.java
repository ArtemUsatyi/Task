package BankingSystem;

import BankingSystem.Service;

public class Main {
    public static void main(String[] args) {
        Person personMark = new Person("Mark", "Smit", "+123456789");
        Bill billMark = new Bill(10000);
        Account accountMark = new Account(personMark, billMark);

        Person personClark = new Person("Clark", "Kent", "121");
        Bill billClark = new Bill(10);

        Account accountClark = new Account(personClark, billClark);

        Service paymentService = new Service();
        paymentService.pay(accountClark,1000);
        paymentService.pay(accountMark,1000);

        DepService depositService = new DepService();
        depositService.deposit(accountClark, 1000000);
    }
}
