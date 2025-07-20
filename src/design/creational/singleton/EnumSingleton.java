package design.creational.singleton;

/*
To overcome this situation with Reflection,
Joshua Bloch suggests the use of enum to implement the singleton design pattern as
Java ensures that any enum value is instantiated only once in a Java program.
*/
public enum EnumSingleton {

    INSTANCE;

    public  void doSomething(){
        System.out.println("Action from Singleton Instance");
    }
}

/*
Since Java Enum values are globally accessible,
so is the singleton.
The drawback is that the enum type is somewhat inflexible
(for example, it does not allow lazy initialization).
*/
