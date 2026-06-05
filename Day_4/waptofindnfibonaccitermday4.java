import java.util.Scanner;
public class waptofindnfibonaccitermday4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of term");
        int n=sc.nextInt();
        int a=0,b=1;
        if(n==1){
            System.out.print(a);
        }
        if(n==2){
            System.out.print(b);
        }
        for(int i=1;i<=n-2;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.print(b);
    }
    
}
