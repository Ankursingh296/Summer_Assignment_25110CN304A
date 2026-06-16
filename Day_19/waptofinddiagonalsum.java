import java.util.Scanner;
public class waptofinddiagonalsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows and colunmn in array");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.print("enter elements in array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j)||((i+j)==n-1)){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.print("diagonal sum"+sum);
    }
    
}
