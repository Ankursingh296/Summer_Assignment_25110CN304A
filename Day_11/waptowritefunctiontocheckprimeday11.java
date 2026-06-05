import java.util.Scanner;
public class waptowritefunctiontocheckprimeday11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int a=sc.nextInt();
        boolean isprime=checkprime(a);
        if(isprime==true){
            System.out.print("prime number");
        }
        else{
            System.out.print("not a prime number");
        }
        }
        public static boolean checkprime(int x){
            if(x<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    

