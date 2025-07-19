package design.behaviour;

import design.interfaces.SoundBehaviour;

public class Bark implements SoundBehaviour {


    @Override
    public void makeSound() {
        System.out.println("I am Barking...");
    }
}
