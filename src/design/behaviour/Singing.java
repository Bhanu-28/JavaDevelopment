package design.behaviour;

import design.interfaces.SoundBehaviour;

public class Singing implements SoundBehaviour {


    @Override
    public void makeSound() {
        System.out.println("I am Singing...");
    }
}
