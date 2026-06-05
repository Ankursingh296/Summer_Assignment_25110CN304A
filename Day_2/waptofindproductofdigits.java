import java.util.Scanner;
public class waptofindproductofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int fact=1;
        while(n!=0){
            fact*=n%10;
            n=n/10;
        }
        System.out.print(fact);
    }
    
}
