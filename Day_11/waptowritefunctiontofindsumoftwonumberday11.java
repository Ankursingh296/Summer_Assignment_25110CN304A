import java.util.Scanner;
public class waptowritefunctiontofindsumoftwonumberday11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int a=sc.nextInt();
        System.out.print("enter second number");
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.print(sum);
    }
    public static int add(int x,int y){
        return x+y;
    }
}