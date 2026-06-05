import java.util.Scanner;
public class waptoprinttherangeofamstrongnumberday4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number");
        int n=sc.nextInt();
        System.out.print("enter the last number");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                count++;
                temp=temp/10;
            }
            int sum=0;
            int temp1=i;
            while(temp1>0){
                int r=temp1%10;
                int p=1;
                for(int j=1;j<=count;j++){
                    p=p*r;
                }
                sum=sum+p;
                temp1=temp1/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }


        }

    }
    
}
