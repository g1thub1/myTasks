package homework.l7.reader;

public class Reader {
    String fullName, bornDate;
    int readerNumber, fsculticy;
    long number;

    public Reader(String fullName, String bornDate, int readerNumber, int fsculticy, long number) {
        this.fullName = fullName;
        this.bornDate = bornDate;
        this.readerNumber = readerNumber;
        this.fsculticy = fsculticy;
        this.number = number;
    }

    public Reader() {
    }

    public String getFullName() {
        return fullName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public int getFsculticy() {
        return fsculticy;
    }

    public long getNumber() {
        return number;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public void setFsculticy(int fsculticy) {
        this.fsculticy = fsculticy;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void takeBook() {
        System.out.println(this.fullName + " взял книгу");
    }

    public void takeBook(int books) {
        System.out.println(this.fullName + " взял книгу" + books + " ");
    }

    public void takeBook(String... arg) {
        System.out.println(this.fullName + "");
        for (String x : arg) {
            System.out.println(x + ",");
        }
        System.out.println(" ");
    }

    public void takeBook(Book... arg) {
        System.out.println(this.fullName + "");
        for (Book x : arg) {
            System.out.println(x.getName() + ",");
        }
        System.out.println(" ");
    }

    public void returnNumber() {
        System.out.println(this.fullName + "");
    }

    public void returnNumber(int books) {
        System.out.println(this.fullName + "" + books + "");
    }

    public void returnBook(Book... arg) {
        System.out.println(this.fullName + " вернул книги: ");
        for (Book x : arg) {
            System.out.print(x.getName() + ", ");
        }
        System.out.println(" ");
    }
}
