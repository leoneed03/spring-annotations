package application.config;

import application.printers.OtherPrinter;
import application.printers.Printer;
import application.printers.SimplePrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("application.printers")
public class PrinterConfig {

    @Bean
    @Qualifier("printerName")
    String printerName() {
        return "Epson easy scan";
    }

    @Bean
    @Qualifier("printerNameExpensive")
    String printerNameExpensive() {
        return "HP cool scan";
    }

    @Bean
    @Qualifier("printerId")
    Integer printerId() {
        return 111;
    }
}
