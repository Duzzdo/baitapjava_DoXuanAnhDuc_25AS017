package b2_4;

public class TestMain {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Duc", 10);
        Invoice inv = new Invoice(101, c, 200.0);

        System.out.println(c);
        System.out.println(inv);
        System.out.println("Amount after discount: " + inv.getAmountAfterDiscount());

        c.setDiscount(25);
        inv.setAmount(500);
        System.out.println("After update: " + inv);
        System.out.println("Amount after discount: " + inv.getAmountAfterDiscount());
    }
}
