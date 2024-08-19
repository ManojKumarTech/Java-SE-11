package OopsConcept;

public class Method {
    //Main Method
    public static void main(String[] args) {
        add1();
        add2(1,2);
        System.out.println(add3());
        System.out.println(add4(3,7));
    }

    //    Non-returnType & Non-Parameterised
    public static void add1(){
        int a = 10;
        int b = 12;
        int c = a+b;
        System.out.println(c);
    }

    //    Non-returnType & Parameterised
    public static void add2(int a,int b){
        int c = a+b;
        System.out.println(c);
    }

    //    returnType & Non-Parameterised
    public static int add3(){
        int a = 15;
        int b = 20;
        int c = a+b;
        return c;
    }

    //    returnType & Parameterised
    public static int add4(int a,int b){
        int c = a+b;
        return c;
    }
}
