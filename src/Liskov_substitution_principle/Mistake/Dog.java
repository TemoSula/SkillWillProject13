package Liskov_substitution_principle.Mistake;

public class Dog extends SoundMakingAnimal{
    @Override
    public void makeSound() {
        System.out.println("I'm dog and just barking");
    }
}
