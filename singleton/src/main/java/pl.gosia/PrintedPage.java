package pl.gosia;

public class PrintedPage {

    private static PrintedPage printing;

    private PrintedPage() {}

    public static PrintedPage getInstance() {
        if (printing == null)
            printing = new PrintedPage();
        return printing;
    }

    public void print() {
        System.out.println("Printing...");
    }
}
