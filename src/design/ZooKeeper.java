package design;

import design.behaviour.Roar;
import design.behaviour.Singing;

public class ZooKeeper {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.display();
        dog.makeSound();
        dog.makeMovement();
        dog.setSoundBehaviour(new Singing());
        dog.makeSound();

        Animal cat = new Cat();
        cat.setSoundBehaviour(new Roar());
        cat.display();
        cat.makeSound();
    }
}
