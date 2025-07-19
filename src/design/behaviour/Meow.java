package design.behaviour;

import design.interfaces.SoundBehaviour;

public class Meow implements SoundBehaviour {


    @Override
    public void makeSound() {
        System.out.println("I Need milk...");
    }
}
