import java.util.Scanner;
public class waptocheckperfectnumberday5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.print("perfect number");
        }
        else{
            System.out.print("not a perfect number");
        }
    }
}

