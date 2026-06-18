import java.util.Scanner;
public class waptoconvertlowercasetouppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String input=sc.nextLine();
        String result=input.toUpperCase();
        System.out.print("upper case string"+result);
    }
    
}
