import java.util.Scanner;
public class waptobubblesort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        System.out.print("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
