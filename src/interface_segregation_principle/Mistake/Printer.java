package interface_segregation_principle.Mistake;

public class Printer implements Machine{

    @Override
    public void print() {
        System.out.println("Start Printing");
    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {

    }

}
