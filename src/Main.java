import Liskov_substitution_principle.Mistake.Animal;
import Liskov_substitution_principle.Mistake.Dog;
import Liskov_substitution_principle.Mistake.Fish;
import Liskov_substitution_principle.Mistake.SoundMakingAnimal;
import dependency_inversion_principle.Correct.Computer;
import dependency_inversion_principle.Correct.ElectricPowerSwitch;
import dependency_inversion_principle.Correct.Fan;
import dependency_inversion_principle.Correct.Swithchable;
import interface_segregation_principle.Correct.MultiFunctionMachine;
import interface_segregation_principle.Correct.PrinterImpl;
import interface_segregation_principle.Mistake.Printer;

public class Main {

    public static void main(String[] args) {


        //dependency inversion

        // Control a Computer
        Swithchable computer = new Computer();
        ElectricPowerSwitch lightSwitch = new ElectricPowerSwitch(computer);
        lightSwitch.switchOn(); // Output: Light bulb is turned on

        // Now control a fan
        Swithchable fan = new Fan();
        ElectricPowerSwitch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.switchOn(); // Output: Fan is turned on


        //interface segregation
        //have both method
        MultiFunctionMachine Machine = new MultiFunctionMachine();
        Machine.printer();
        Machine.scan();
        //have only one because neccesary is only one
        PrinterImpl printer = new PrinterImpl();
        printer.print();


        //Liskov subsitution
        SoundMakingAnimal dog = new Dog();
        dog.makeSound();

        Animal fish = new Fish();
        //თევზს არ შეუძლია ყვირილი ამიტომ არააქ ეგ მეთოდი



    }
}