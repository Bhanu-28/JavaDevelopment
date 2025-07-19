package design;

import design.interfaces.MoveBehaviour;
import design.interfaces.SoundBehaviour;

public abstract class Animal {

    SoundBehaviour soundBehaviour;

    MoveBehaviour moveBehaviour;

    abstract void display();

    public void makeSound(){
        soundBehaviour.makeSound();
    }

    public void makeMovement(){
        moveBehaviour.run();
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour){
        this.soundBehaviour = soundBehaviour;
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour){
        this.moveBehaviour = moveBehaviour;
    }

    public void breathing(){
        System.out.println("I am breathing...");
    }
}
