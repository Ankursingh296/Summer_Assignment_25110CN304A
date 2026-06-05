import java.util.Scanner;
public class waptorecursivesumofdigitsday7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int result=sumofdigits(n);
        System.out.print(result);
    }
    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+sumofdigits(n/10);
        }
        }
    }
    

