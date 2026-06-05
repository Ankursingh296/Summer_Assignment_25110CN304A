import java.util.Scanner;
public class waptocheckwhetherthenumberispallendromeornot {
    public static void main(Strin[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int reverse=n;
        while(n!=0){
            sum=sum*10;
            sum=sum+n%10;
            n=n/10;
        }
        if(reverse==sum){
            System.out.print("the number is pallendrome");
        }else{
            System.out.print("the number is not pallendrome");
        }
    }
    
}
