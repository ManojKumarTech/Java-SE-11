package Inheritance;


public class Introduction {
    public static void main(String args[]){
        Dog dObj = new Dog();
        System.out.println(dObj.canBark);
        dObj.eat();
        dObj.walk();


    }
}
class Animals{
    int noLegs = 4;
    public static void eat(){
        System.out.println("I can eat");
    }
    public static void walk(){
        System.out.println("I can Walk");
    }
}

class Dog extends Animals{
    boolean canBark = true;
}