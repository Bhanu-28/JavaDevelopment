package design.behaviour;

import design.interfaces.MoveBehaviour;

public class Flying implements MoveBehaviour {


    @Override
    public void run() {
        System.out.println("I am Flying...");
    }
}
