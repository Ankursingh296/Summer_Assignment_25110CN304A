import java.util.Scanner;
public class waptoaddtwomatrices {
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
        if((m==r)&&(n==s)){
        
            int c[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    c[i][j]=a[i][j]+b[i][j];

                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(c[i][j]);
                }
                System.out.println();
            }

        }
        else{
             System.out.print("addition of matrix is not possible");

           
        }

    }
    
}
