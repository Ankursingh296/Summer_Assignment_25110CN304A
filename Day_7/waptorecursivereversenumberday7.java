import java.util.Scanner;
public class waptorecursivereversenumberday7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int result=reversenumber(n);
        System.out.print(result);
    }
    public static int reversenumber(int n){
        int rev=0;
        if(n==0){
            return rev;
        }
        else{
            rev=rev*10+n%10;
            return reversenumber(n/10);
        }
        }
    }
    

