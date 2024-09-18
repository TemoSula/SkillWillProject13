package dependency_inversion_principle.Correct;

public class Fan implements Swithchable{
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }
}
