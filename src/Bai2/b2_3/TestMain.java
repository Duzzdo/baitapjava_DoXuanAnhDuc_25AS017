package Bai2.b2_3;

public class TestMain {
    public static void main(String[] args) {
        Author a = new Author("Martin", "martin@gmail.com");
        Book b = new Book("123-456", "Clean Code", a, 88.8, 5);

        System.out.println(b);
        System.out.println("Author name: " + b.getAuthorName());

        a.setEmail("new@gmail.com");
        b.setPrice(99.9);
        b.setQty(10);
        System.out.println("After update: " + b);
    }
}
