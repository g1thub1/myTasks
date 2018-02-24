package homework.l7.reader;

public class ReaderDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "author1");
        Book book2 = new Book("Book2", "author2");
        Book book3 = new Book("Book3", "author3");

        Reader reader1 = new Reader("Ivanov", "01.01.1900", 11111, 22222, 33333);
        Reader reader2 = new Reader("Petrov", "02.02.1901", 22222, 33333, 44444);
        Reader reader3 = new Reader("Volkov", "03.03.1903", 33333, 44444, 55555);

        reader1.takeBook(4);
        reader2.takeBook("Harry Potter", "Sherlock");
        reader2.takeBook(book1, book2);
        reader3.takeBook(book3);
        reader2.returnBook(book1, book2);
    }
}
