import java.util.Scanner;
public class waptofindlargestandsmallestelementinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("the largest element in array is"+largest);
        System.out.print("the smallest element in array is"+smallest);
    }
    
}
