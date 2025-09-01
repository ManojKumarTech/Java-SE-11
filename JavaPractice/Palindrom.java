package JavaPractice;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        byte a = 0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                a=1;
                System.out.println(str.charAt(i)+"_"+str.charAt(str.length()-1-i));
                break;
            }
        }
        if(a==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
