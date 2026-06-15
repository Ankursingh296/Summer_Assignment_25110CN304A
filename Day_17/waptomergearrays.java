import java.util.Scanner;
public class waptomergearrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of first array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the elements of first array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the size of second array");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.print("enter the elements of second array");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[n+m];
        for(int i=0;i<n;i++){
            c[i]=a[i];
        }
        for(int i=0;i<m;i++){
            c[n+i]=b[i];
        }
        System.out.print("the merged array is");
        for(int i=0;i<n+m;i++){
            System.out.print(c[i]+" ");
        }
    }
    
}