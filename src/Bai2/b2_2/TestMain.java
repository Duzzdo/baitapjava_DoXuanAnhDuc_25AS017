package Bai2.b2_2;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = {
                new Author("Tan Ah Teck", "tan@gmail.com", 'm'),
                new Author("Paul Tan", "paul@gmail.com", 'm')
        };

        Book book1 = new Book("Java Advanced", authors, 88.8);
        Book book2 = new Book("OOP Design", authors, 120.5, 50);

        System.out.println(book1);
        System.out.println("Author names: " + book1.getAuthorNames());

        book2.setPrice(150.0);
        book2.setQty(99);
        System.out.println(book2);
    }
}
