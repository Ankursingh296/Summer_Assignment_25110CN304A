import java.util.Scanner;
public class waptofindgcdoftwonumberday3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int m=sc.nextInt();
        System.out.print("enter second number");
        int n=sc.nextInt();
        int gcd=1;
        for(int i=1;(i<=m)&&(i<=n);i++){
            if(m%i==0&&n%i==0)gcd=i;
        }
        System.out.print(gcd);
    }
    
}
