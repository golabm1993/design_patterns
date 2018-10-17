package pl.gosia;

public class PrintingSingleton {

    public static void main(String[] args) {

        PrintedPage newPage = PrintedPage.getInstance();

        newPage.print();
    }
}
