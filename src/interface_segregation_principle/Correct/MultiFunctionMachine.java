package interface_segregation_principle.Correct;

import interface_segregation_principle.Correct.Printer;

public class MultiFunctionMachine implements Printer, Scanner {

    @Override
    public void printer() {
        System.out.println("Printing.....");
    }

    @Override
    public void scan() {
        System.out.println("Scannning.....");
    }
}
