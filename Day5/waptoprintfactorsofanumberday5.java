import java.util.Scanner;
public class waptoprintfactorsofanumberday5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        System.out.print("factors of "+n+" are:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i);
            }
        }
    }
    
}
