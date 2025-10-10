public class Main {
    static void main(String[] args) {

        //Test Constructor and toString()
    Account a1= new Account("A101", 9999,"Đức");
        System.out.println(a1);
    Account a2= new Account("A102",1000,"A");
        System.out.println(a2);

        // Test Getter and Setter
        System.out.println("ID: "+ a1.getId());
        System.out.println("Name: "+a1.getName());
        System.out.println("Balance: "+ a1.getBalance());

        //Test credit() and debit()
        a1.credit(1000);
        System.out.println(a1.getBalance());
        a1.debit(1000);
        System.out.println(a1.getBalance());
        a1.debit(5000);
        System.out.println(a1.getBalance());
        a2.credit(5000);
        System.out.println(a2.getBalance());
        a2.debit(3000);
        System.out.println(a2.getBalance());

        //Test transferTo()
        a1.transferTo(a2,1000);
        System.out.println(a1);
        System.out.println(a2);
        a1.transferTo(a2,10000);
        System.out.println(a1);
        System.out.println(a2);
    }
}