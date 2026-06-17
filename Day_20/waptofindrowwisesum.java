import java.util.Scanner;
public class waptofindrowwisesum {
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
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    sumeven=sumeven+a[i][j];
                }
                else{
                    sumodd=sumodd+a[i][j];
                }
            }
        }
        int c=sumeven+sumodd;
        System.out.print("total sum is"+c);
        
    }
    
}
