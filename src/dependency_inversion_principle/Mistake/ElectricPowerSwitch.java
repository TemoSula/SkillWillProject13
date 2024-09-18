package dependency_inversion_principle.Mistake;

public class ElectricPowerSwitch {
    private Computer computer;

    public ElectricPowerSwitch(Computer computer) {
        this.computer = computer;
    }
    public void SwithON()
    {
        computer.turnOn();
    }
}
