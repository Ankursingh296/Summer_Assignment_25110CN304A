import java.util.Scanner;
public class waptotransposematrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of row and column of matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.print("enter elements in matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
      int b[][]=new int[m][n];
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.print("transpose of matrix is");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]);

            }
        }
    }
    
}
