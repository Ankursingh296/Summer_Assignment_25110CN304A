import java.util.Scanner;
public class waptofindinsertionoftwoarrays {
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
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    c[k]=a[i];
                    k++;
                }
            }
        }
        System.out.print("the common elements of two arrays are");
        for(int i=0;i<k;i++){
            System.out.print(c[i]+" ");
        }
    }
    
    
}
