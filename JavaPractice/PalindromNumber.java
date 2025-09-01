package JavaPractice;
import java.util.Scanner;
public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int s = n;
        while(n!=0){
            a=a*10+n%10;
            n=n/10;
        }
        if(a==s){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
