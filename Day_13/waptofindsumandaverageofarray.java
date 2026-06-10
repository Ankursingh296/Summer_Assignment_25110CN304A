import java.util.Scanner;
public class waptofindsumandaverageofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.print("the sum of array is"+sum);
        double average=(double)sum/size;
        System.out.print("the average of array is"+average);
    }
    
}
