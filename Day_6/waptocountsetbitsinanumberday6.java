import java.util.Scanner;
public class waptocountsetbitsinanumberday6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%2;
            if(rem==1){
                count++;
            }
            num=num/2;
        }
        System.out.print(count);
    }
    
}
