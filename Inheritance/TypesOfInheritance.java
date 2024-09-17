package Inheritance;

public class TypesOfInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}

class Father{
    char gender = 'M';
    void print(){
        System.out.println(gender);
    }
}

//Single Inheritance
class Son extends Father{

}
