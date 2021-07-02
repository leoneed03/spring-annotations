package application.printers;

public class OtherPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("SHOULD NOT BE PRINTED");
    }
}
