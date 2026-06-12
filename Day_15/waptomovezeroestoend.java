import java.util.Scanner;
public class waptomovezeroestoend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
            
        }
        while(count<n){
            arr[count]=0;
            count++;
        }
        System.out.print("the array with zeroes at end is");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    

}
