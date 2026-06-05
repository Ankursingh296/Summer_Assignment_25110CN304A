import java.util.Scanner;
public class waptofindxpownwithoutpowday6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int x=sc.nextInt();
        System.out.print("enter a power");
        int n=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        System.out.print(result);
    }
}

