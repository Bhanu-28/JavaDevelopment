package design;

import design.behaviour.Bark;
import design.behaviour.Jumping;
import design.behaviour.Meow;
import design.behaviour.Running;

public class Cat extends Animal{


    public Cat(){
        soundBehaviour = new Meow();
        moveBehaviour = new Jumping();
    }

    @Override
    void display(){
        System.out.println(" I am a cat");
    }
}
