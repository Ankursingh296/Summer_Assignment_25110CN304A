import java.util.Scanner;
public class waptoconvertdecimaltobinaryday6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a decimal number");
        int decimal=sc.nextInt();
        String binary="";
        while(decimal>0){
            int rem=decimal%2;
            binary=binary+rem;
            decimal=decimal/2;
        }
        String reverse="";
        for(int i=binary.length()-1;i>=0;i--){
            reverse=reverse+binary.charAt(i);
        }
        System.out.print(reverse);
    }
}