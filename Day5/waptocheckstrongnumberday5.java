import java.util.Scanner;
public class waptocheckstrongnumberday5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n){
            System.out.print("strong number");
        }
        else{
            System.out.print("not a strong number");
        }
        }





    }
    

