package Bai7.b7_1;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Visit visit = new Visit("Duc", new Date());
        visit.getCustomer().setMemberType("Premium");

        visit.setServiceExpense(200);
        visit.setProductExpense(100);

        System.out.println(visit);
    }
}
