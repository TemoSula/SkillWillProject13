package dependency_inversion_principle.Correct;

public class Computer implements Swithchable{
    @Override
    public void turnOn() {
        System.out.println("Computre is turned on");
    }
}
