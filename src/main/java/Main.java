import book.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bh = new BookHelper();
        String[] names = {"Bot", "Bot2", "Nebratni"};

        for (String name : names) {
            Book book = new Book();
            book.setName(name);
            bh.addBook(book);
        }

        List<Book> bookList = bh.getBookList();

        for (Book b : bookList) {
            System.out.println(b.getId() + " " + b.getName());
        }

        Book b = bh.getBookById(3);
        System.out.println(b.getName());
    }
}
