import java.util.Scanner;
public class waptounionofarrays {
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
        int k=n;
        for(int i=0;i<m;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(b[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                c[k]=b[i];
                k++;
            }
        }
        System.out.print("the union of two arrays is");
        for(int i=0;i<k;i++){
            System.out.print(c[i]+" ");
        }
    }

    
}
