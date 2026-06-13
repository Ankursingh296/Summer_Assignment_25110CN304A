import java.util.Scanner;
public class waptofindmissingnumberinarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
       int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
       }
        int total=((n)*(n+1))/2;
       int missing=total-sum;
       System.out.print("the missing number is"+missing);

    }

}