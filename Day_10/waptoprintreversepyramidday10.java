import java.util.Scanner;
public class waptoprintreversepyramidday10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows");
        int n=sc.nextInt();
        int nsp=0;
        int nst=2*n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            nsp=nsp+1;
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nst=nst-2;
            System.out.println();
        }
    }
    
}
