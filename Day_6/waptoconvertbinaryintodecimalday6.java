import java.util.Scanner;
public class waptoconvertbinaryintodecimalday6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a binary number");
        String binary=sc.next();
        int decimal=0;
        int power=1;
        for(int i=binary.length()-1;i>=0;i--){
            int bit=binary.charAt(i)-'0';
            decimal=decimal+bit*power;
            power=power*2;
        }
        System.out.print(decimal);
    }
    
}
