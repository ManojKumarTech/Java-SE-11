package OopsConcept;

class Constructor1 {
    private String name;
    private int age;

    Constructor1(String name,int age){
        System.out.println("This is Constructor");
        this.name=name;
        this.age=age;
    }
    void show1(){
        System.out.println(name);
        System.out.println(age);
    }



}
class Main2{
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1("Ahil",19);
        c1.show1();
    }
}

