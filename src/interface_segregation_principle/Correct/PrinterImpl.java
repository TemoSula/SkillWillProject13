package interface_segregation_principle.Correct;

import interface_segregation_principle.Mistake.Printer;

public class PrinterImpl extends Printer {
    @Override
    public void print() {
        System.out.println("Printing....");
    }
}
