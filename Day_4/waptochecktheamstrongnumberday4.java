import java.util.Scanner;
public class waptochecktheamstrongnumberday4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;

        }
        int sum=0;
        int temp1=n;
        while(temp1>0){
            int r=temp1%10;
            int p=1;
            for(int i=1;i<=count;i++){
                p=p*r;
            }
            sum=sum+p;
            temp1=temp1/10;
        }
        if(sum==n){
            System.out.print("the number is armstrong");
        }
        else{
            System.out.print("the number is not armstrong");
        }
        }
    }
    

