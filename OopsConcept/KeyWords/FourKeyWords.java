package OopsConcept.KeyWords;

class Father{

    //Static:-used by calling the class
    static int age = 52;
    char gender = 'M';
    public Father(){
        System.out.println("Iam Father Class");
    }
}
class Mother{
    int age = 46;
    //Final:-Can't be changed
    final char gender = 'F';
    public Mother(){
        System.out.println("Iam Mother Class");
    }
}
class Son extends Father{
    int age;
    //Super:- Calling the same attributes from parent class
    char gender = super.gender;
    public Son(){
        System.out.println("Iam Son class");
    }
    void print(int age){
        //this:-using the same var
        this.age=age;
        System.out.println("Age : "+age +"\n"+"Gender : "+gender);
    }
}

public class FourKeyWords {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println("Father age : "+Father.age);
        Mother m = new Mother();
        System.out.println("Mothers age : "+m.gender);
        Son s = new Son();
        s.print(18);
    }
}
