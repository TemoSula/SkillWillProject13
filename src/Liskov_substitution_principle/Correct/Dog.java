package Liskov_substitution_principle.Correct;

public class Dog extends Animal implements MakeSoundAnimal{
    @Override
    public void makeSound() {
        System.out.println("I'm a dog and I'm barking");
    }
}
