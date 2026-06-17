import java.util.Scanner;
public class waptomultiplymatrices{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter rows of array");
        int m=sc.nextInt();
        System.out.print("enter column of array");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.print("enter elements in array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
         System.out.print("enter rows of array");
        int r=sc.nextInt();
        System.out.print("enter column of array");
        int s=sc.nextInt();
        int b[][]=new int[r][s];
        System.out.print("enter elements in array");
        for(int i=0;i<r;i++){
            for(int j=0;j<s;j++){
                b[i][j]=sc.nextInt();
            }
        }
        if(n==r){
            int c[][]=new int[m][s];
            for(int i=0;i<m;i++){
                for(int j=0;j<s;j++){
                    for(int k=0;k<n;k++){
                        c[i][j]+=(a[i][k]*b[k][j]);

                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<s;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
            else{
                System.out.print("multiplication is not possible");
            
        }
    }
}