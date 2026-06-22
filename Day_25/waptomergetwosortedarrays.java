import java.util.*;
public class waptomergetwosortedarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of first array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("enter size of second array");
        int m=sc.nextInt();
        int brr[]=new int[n];
        System.out.print("enter element in array");
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int merged[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length&&j<brr.length){
            if(arr[i]<=brr[j]){
                merged[k++]=arr[i++];
            }
            else{
                merged[k++]=brr[j++];
            }
        }
        while(i<arr.length){
            merged[k++]=arr[i++];
        }
        while(j<brr.length){
            merged[k++]=brr[j++];
        }
        System.out.print("merged array");
        for(int num:merged){
            System.out.print(num+" ");
        }
    }
    
}
