import java.util.Scanner;
public class waptochecksymmetricmatrix {
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
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==a[j][i]){
                    c=c+1;
                }
            }
        }
        if(c!=0){
            System.out.print("matrix is symmetric");
        }
        else{
            System.out.print("matrix is not symmetric");
        }
    }
    
}
