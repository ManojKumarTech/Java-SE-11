package OopsConcept;

public class AccessModifiers {
    private String name;
    private int age;

    public void setInfo(String name,int age){    //public void setInfo(String n,int a){
        this.name=name;                          //name=n;
        this.age=age;                            //age=a;
    }                                            //}

    public  void getInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String[] args) {
        //Creating Object
        AccessModifiers user1 = new AccessModifiers();
        AccessModifiers user2 = new AccessModifiers();


        //Setting values
        //user1.name="Manoj";
        //user1.age=19;
        //display
        user1.setInfo("Manoj",19);
        user1.getInfo();

        //parameterized value
        user2.setInfo("Kumar",19);
        user2.getInfo();


    }
}
