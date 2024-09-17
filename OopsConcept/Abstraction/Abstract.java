package OopsConcept.Abstraction;

public class Abstract {
    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.turnOn();
        hp.turnOf();
        System.out.println();
        Dell dell = new Dell();
        dell.turnOn();
        dell.turnOf();
    }
}

//This is the abstract class
//Cant create obj using this class
//So we extend use inheritance;
abstract class Computer{
    abstract void turnOn();
    abstract void turnOf();
}

class Hp extends Computer{

    public Hp(){
        System.out.println("Hp Computer");
    }

    @Override
    void turnOn() {
        System.out.println("Turning On");
    }
    @Override
    void turnOf() {
        System.out.println("Turning Off");
    }
}

class Dell extends Computer{

    public Dell(){
        System.out.println("Dell Computer");
    }

    @Override
    void turnOn(){
        System.out.println("Turning On");
    }

    @Override
    void turnOf() {
        System.out.println("Turning Off");
    }
}

