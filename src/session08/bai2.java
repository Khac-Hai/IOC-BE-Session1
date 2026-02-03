package session08;

public class bai2 {
    public static void main(String[] args) {
        Book book1 = new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 45000);
        book1.printInfo();
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
