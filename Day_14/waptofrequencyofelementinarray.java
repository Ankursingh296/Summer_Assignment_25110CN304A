import java.util.Scanner;
public class waptofrequencyofelementinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the elements to find frequency");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                count++;
            }
        }
        System.out.print("frequency of element is"+count);
    }

}
