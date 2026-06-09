import java.util.Scanner;
public class waptowriteafunctionforamstrong {
    public static boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        int digit=0;
        int temp=num;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=num;
        while(temp>0){
            int digits=temp%10;
sum+=Math.pow(digits,digit);
temp=temp/10;
        }
        return sum==original;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.print("the number is Armstrong number");
        }
        else{
            System.out.print("the number is not an Armstrong number");
        }
    }
    
}
