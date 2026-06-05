import java.util.Scanner;
public class waptowritefunctiontofindfactorialday11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int a=sc.nextInt();
        int factorial=findfactorial(a);
        System.out.print(factorial);
    }
    public static int findfactorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}
