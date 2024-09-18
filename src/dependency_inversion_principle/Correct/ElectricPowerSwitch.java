package dependency_inversion_principle.Correct;

public class ElectricPowerSwitch {
    private Swithchable swithchable;

    public ElectricPowerSwitch(Swithchable swithchable) {
        this.swithchable = swithchable;
    }
    public void switchOn()
    {
        swithchable.turnOn();
    }

}
