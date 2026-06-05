import java.util.Scanner;
public class waptowritefunctiontofindmaximumoftwonumberday11 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first number");
    int a=sc.nextInt();
    System.out.print("enter second number");
    int b=sc.nextInt();
    int max=findmax(a,b);
    System.out.print(max);
}
public static int findmax(int x,int y){
    if(x>y){
        return x;
    }
    else{
        return y;
    }
    }
}

