package OopsConcept.Abstraction;

interface Mother{
    //the method should be abstracted
    abstract void speak();
    abstract void walk();
}
interface Father{
    //the method should be abstracted
    abstract void speak();
    abstract void walk();
}

class Son implements Father,Mother{//[Father,Mother]->Multiple inheritance
    @Override
    public void speak() {
        System.out.println("Iam Speaking");
    }

    @Override
    public void walk() {
        System.out.println("Iam Walking");
    }
}


public class InterFace {
    public static void main(String[] args) {
        Son s = new Son();
        s.speak();
        s.walk();
    }
}
