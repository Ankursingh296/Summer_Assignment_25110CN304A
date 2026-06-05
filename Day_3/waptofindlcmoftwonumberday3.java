import java.util.Scanner;
public class waptofindlcmoftwonumberday3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int m=sc.nextInt();
        System.out.print("enter second number");
        int n=sc.nextInt();
        int lcm=(m>n)?m:n:1;
        while(true){

            if(lcm%m==0&&lcm%n==0){
                System.out.println("lcm of"+m+and"+n+)
                break;
            }

        }
    }
    
}
