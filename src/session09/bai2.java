package session09;

import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 45000);
        Book b2 = new Book("Tuổi Trẻ Đáng Giá Bao Nhiêu", "Rosie Nguyễn", 99000);
        Book b3 = new Book("Harry Potter", "J.K. Rowling", 150000);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println("=== Danh sách sách ===");
        for (Book book : books) {
            book.printInfo();
        }
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
        System.out.printf("Title: %s, Author: %s, Price: %.0f VND%n", title, author, price);
    }
}
