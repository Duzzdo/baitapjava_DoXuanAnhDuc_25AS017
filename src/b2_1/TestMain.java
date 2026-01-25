package b2_1;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = {
                new Author("Alice", "alice@gmail.com", 'f'),
                new Author("Bob", "bob@gmail.com", 'm')
        };

        Book book = new Book("Java OOP", authors, 99.9, 10);

        System.out.println(book);
        System.out.println("Author names: " + book.getAuthorNames());
    }
}
