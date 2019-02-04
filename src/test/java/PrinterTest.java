import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void Before(){
        printer = new Printer(250, 100);
    }


    @Test
    public void printerHasPaper() {
        assertEquals(true, printer.hasPaper());

    }
    @Test
    public void printerHasNoPaper() {
        Printer emptyPrinter = new Printer(0, 100);
        assertEquals(false, emptyPrinter.hasPaper());
    }

    @Test
    public void getToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void print() {
        printer.print(10,3);
        assertEquals(220, printer.getPaper());
        assertEquals(70, printer.getToner());
    }

    @Test
    public void fillPaper() {
        printer.fillPaper();
        assertEquals(250, printer.getPaper());
    }

    @Test
    public void fillToner() {
        printer.fillToner();
        assertEquals(100, printer.getToner());
    }


}
