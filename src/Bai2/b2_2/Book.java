package Bai2.b2_2;

public class Book {
    private String name;
    private Author[] authors;   // ARRAY OF OBJECTS
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // chỉ lấy TÊN tác giả
    public String getAuthorNames() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].getName());
            if (i < authors.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsStr.append(authors[i]);
            if (i < authors.length - 1) authorsStr.append(", ");
        }

        return "Book[name=" + name +
                ",authors={" + authorsStr +
                "},price=" + price +
                ",qty=" + qty + "]";
    }
}

