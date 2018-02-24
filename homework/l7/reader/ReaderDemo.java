package homework.l7.reader;

public class ReaderDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "author1");
        Book book2 = new Book("Book2", "author2");
        Book book3 = new Book("Book3", "author3");
        Book book4 = new Book("Book4", "author4");
        Book book5 = new Book("Book5", "author4");

        Reader reader1 = new Reader("","",5422 , 6543, 543);
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        Reader reader4 = new Reader();
        Reader reader5 = new Reader();

        reader1.takeBook(4);

    }
}
