import java.util.Scanner;
public class waptofindlargestprimefactorday5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        int largest=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                largest=i;
                n=n/i;
            }
        }
        System.out.print(largest);

    }
    
}
