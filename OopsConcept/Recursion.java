package OopsConcept;

public class Recursion {

    public static void main(String[] args) {
        recursion1(7);
        fac(3);
        show();
        fib(10);
    }

    public static void recursion1(int a){
        //Base Case
        if(a==1){
            System.out.println(a);
        }

        //Recursive Case
        else{
            System.out.println(a);
            recursion1(a-1);
        }
    }
    public static int r = 1;
    public static void fac(int a) {

        if (a == 1) {
            System.out.println(r);
        }
        else{
            r=a*r;
            fac(a-1);
        }
    }
    static int n1=0,n2=1,n3=0;
    public static void fib(int a){
        if(a>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fib(a-1);
        }
    }
    public static void show(){
        System.out.print(0+" "+1+" ");
    }

}
