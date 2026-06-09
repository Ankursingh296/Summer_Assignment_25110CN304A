import java.util.Scanner;
public class waptowriteafunctionforfibonacci {
    
        public static void fibonacci(int n){
            int a=0;
            int b=1;
            System.out.print("Fibonacci series is");
            for(int i=1;i<=n;i++){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
            }
            
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number of terms");
            int n=sc.nextInt();
            fibonacci(n);
        }
    }
    

