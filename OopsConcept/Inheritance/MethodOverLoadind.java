package OopsConcept.Inheritance;

public class MethodOverLoadind {
    public static void main(String[] args) {
        Method mObj = new Method();
        mObj.min(10,100);
        mObj.min(10,50,2);
    }
}
class Method{
    void min(int a,int b){
        if(a>b){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
    void min(int a,int b,int c){
        if(a>b && c>b){
            System.out.println(b);
        }else if(b>a && c>a){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }
}

