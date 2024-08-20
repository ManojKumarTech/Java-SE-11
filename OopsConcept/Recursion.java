package OopsConcept;

public class Recursion {

    public static void main(String[] args) {
        recursion1(7);
        fac(3);
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

}
