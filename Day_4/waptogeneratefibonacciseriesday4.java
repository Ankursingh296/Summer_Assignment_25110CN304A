import java.util.Scanner;
public class waptogeneratefibonacciseriesday4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print("fibonacci series is");
        if(n==1||n>1){
            System.out.print(a);
        }
        if(n==2||n>2){
            System.out.print(b);
        }
        for(int i=1;i<=n-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c);
        }
    }
}