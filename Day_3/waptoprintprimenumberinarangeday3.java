import java.util.Scanner;
public class waptoprintprimenumberinarangeday3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number");
        int n=sc.nextInt();
        System.out.print("enter last number");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)c=c+1;
            }
            if(c==2)System.out.print(i+" ");
        }
    }
    
}
