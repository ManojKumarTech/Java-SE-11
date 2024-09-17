package OopsConcept.Inheritance;

public class TypesOfInheritance {
    public static void main(String[] args) {
        GrandFather GH = new GrandDaughter();
        GH.print();
        Mother M = new Mother();
        M.print();
        Uncle U = new Uncle();
        U.print();
        Daughter s = new Daughter();
        s.print();
        GrandDaughter GD = new GrandDaughter();
        GD.print();

    }
}

class GrandFather{
    char gender = 'M';
    void print(){
        System.out.println("Iam GrandFather");
        System.out.println("Gender:"+gender);
    }
}

//Single OopsConcept.Inheritance
class Mother extends GrandFather{
      char gender = 'F';
      void print(){
          System.out.println("Iam Mother");
          System.out.println("Gender:"+gender);
      }
}


//Multi-level OopsConcept.Inheritance
class Daughter extends Mother{
     void print(){
         System.out.println("Iam Daughter of Mother Class");
         System.out.println("Gender:"+gender);
     }
}

//Hybrid OopsConcept.Inheritance
class Uncle extends GrandFather{
    void print(){
        System.out.println("Iam GrandFather's son(Uncle class) ");
        System.out.println("Gender:"+gender);
    }
}
//Hierarchical [Hybrid + MultiLevel]
class GrandDaughter extends Daughter{
    void print(){
        System.out.println("Iam GrandDaughter Daughter class's Daughter ");
        System.out.println("Gender:"+gender);
    }
}
