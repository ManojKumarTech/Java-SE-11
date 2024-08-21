package OopsConcept;

public class AccessModifiers {
    private String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public void setInfo(String name,int age){    //public void setInfo(String n,int a){
        this.name=name;                          //name=n;
        this.age=age;                            //age=a;
    }                                            //}
}

class Main{
    public static void main(String[] args) {
        //Creating Object
        Class_Object user1 = new Class_Object();
        Class_Object user2 = new Class_Object();


        //Setting values
        user1.name="Manoj";
        user1.age=19;
        //display
        user1.display();

        //parameterized value
        user2.setInfo("Kumar",19);
        user2.display();

    }
}
