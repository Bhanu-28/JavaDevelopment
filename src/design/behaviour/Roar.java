package design.behaviour;

import design.interfaces.SoundBehaviour;

public class Roar implements SoundBehaviour {


    @Override
    public void makeSound() {
        System.out.println("I am King of the Jungle Roaring...");
    }
}
