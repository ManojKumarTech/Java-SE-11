package Inheritance;

public class TypesOfInheritance {
    public static void main(String[] args) {
        Daughter s = new Daughter();
        s.print();
    }
}

class GrandFather{
    char gender = 'M';
    void print(){
        System.out.println(gender);
    }
}

//Single Inheritance
class Mother extends GrandFather{
      char gender = 'F';
      void print(){
          System.out.println(gender);
      }
}

//Multi-level Inheritance
class Daughter extends Mother{

}
