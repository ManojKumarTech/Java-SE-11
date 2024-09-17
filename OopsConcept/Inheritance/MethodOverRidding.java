package OopsConcept.Inheritance;

public class MethodOverRidding {
    public static void main(String args[]) {
        Dogs dObj = new Dogs();
        System.out.println(dObj.canBark);
        dObj.eat();
        dObj.walk();

    }
    }
class Animal{
    int noLegs = 4;
    public static void eat(){
        System.out.println("I can eat");
    }
    public static void walk(){
        System.out.println("I can Walk");
    }
}

class Dogs extends Animals{
    boolean canBark = true;
    int noLegs = 5;
    public static void eat() {
        System.out.println("I can't eat");
    }

}
