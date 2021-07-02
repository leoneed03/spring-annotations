package application.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimplePrinter implements Printer {

    private NonImplementedPrinter nonImplementedPrinter;

    public String name;

    public String getName() {
        return name;
    }

    @Autowired(required = false)
    public SimplePrinter(@Qualifier("printerName") String name) {
        this.name = name;
    }

    @Autowired(required = false)
    public SimplePrinter(@Qualifier("printerId") Integer nameId) {
        this.name = String.valueOf(nameId);
    }
    public SimplePrinter() {
        this.name = "DEFAULT NAME PRINTER";
    }

    @Override
    public void print() {
        System.out.println("Simple Printer printing.. " + getName());
    }

    public NonImplementedPrinter getNonImplementedPrinter() {
        return nonImplementedPrinter;
    }

    @Autowired(required = false)
    public void setNonImplementedPrinter(NonImplementedPrinter nonImplementedPrinter) {
        this.nonImplementedPrinter = nonImplementedPrinter;
    }
}
