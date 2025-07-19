package design;

import design.behaviour.Bark;
import design.behaviour.Flying;
import design.behaviour.Running;
import design.behaviour.Singing;

public class Parrot extends Animal{


    public Parrot(){
        soundBehaviour = new Singing();
        moveBehaviour = new Flying();
    }

    @Override
    void display(){
        System.out.println(" I am an Dog");
    }
}
