package design;

import design.behaviour.Bark;
import design.behaviour.Roar;
import design.behaviour.Running;
import design.behaviour.Sleeping;

public class Lion extends Animal{


    public Lion(){
        soundBehaviour = new Roar();
        moveBehaviour = new Sleeping();
    }

    @Override
    void display(){
        System.out.println(" I am a Lion");
    }
}
