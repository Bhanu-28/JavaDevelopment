package design.behaviour;

import design.interfaces.MoveBehaviour;

public class Jumping implements MoveBehaviour {


    @Override
    public void run() {
        System.out.println("I am Jumping...");
    }
}
