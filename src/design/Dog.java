package design;

import design.behaviour.Bark;
import design.behaviour.Running;

public class Dog extends Animal{

    public Dog(){
        soundBehaviour = new Bark();
        moveBehaviour = new Running();
    }
    @Override
    void display(){
        System.out.println(" I am an Dog");
    }
}
