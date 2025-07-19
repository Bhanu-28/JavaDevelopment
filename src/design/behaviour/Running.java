package design.behaviour;

import design.interfaces.MoveBehaviour;
import design.interfaces.SoundBehaviour;

public class Running implements MoveBehaviour {


    @Override
    public void run() {
        System.out.println("I am Running...");
    }
}
