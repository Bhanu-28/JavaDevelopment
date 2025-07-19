package design.behaviour;

import design.interfaces.MoveBehaviour;

public class Sleeping implements MoveBehaviour {


    @Override
    public void run() {
        System.out.println("I am Sleeping...");
    }
}
