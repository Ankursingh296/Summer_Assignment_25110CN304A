import java.util.Scanner;
public class waptofindpairwithgivensuminarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the sum");
        int sum=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.print("the pair is"+arr[i]+"and"+arr[j]);
                }
            }
        }
    }
    
}
