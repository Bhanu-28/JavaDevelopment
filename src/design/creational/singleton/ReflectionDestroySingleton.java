package design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroySingleton {

    public static void main(String[] args) {

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }

        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
