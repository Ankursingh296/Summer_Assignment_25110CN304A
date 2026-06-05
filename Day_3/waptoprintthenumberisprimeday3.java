import java.util.Scanner;
public class waptoprintthenumberisprimeday3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0)c=c+1;
        }
        if(c==0)System.out.print("the number is prime");
        else System.out.print("the number is not prime");
    }
}