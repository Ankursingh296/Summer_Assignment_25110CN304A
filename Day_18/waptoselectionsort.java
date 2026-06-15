import java.util.Scanner;
public class waptoselectionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;

        }
        System.out.print("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
