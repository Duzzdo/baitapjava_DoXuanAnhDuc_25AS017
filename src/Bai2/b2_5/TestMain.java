package Bai2.b2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Duc", 'm');
        Account acc = new Account(1001, c, 50.0);

        System.out.println(acc);
        acc.deposit(25.5);
        System.out.println("After deposit: " + acc);

        acc.withdraw(30);
        System.out.println("After withdraw: " + acc);

        acc.withdraw(1000);
        System.out.println("After fail withdraw: " + acc);
    }
}

