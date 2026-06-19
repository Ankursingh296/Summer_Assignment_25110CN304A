import java.util.Scanner;
public class waptoremovespacesfromstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String input=sc.nextLine();
        String result=input.replace(" ","");
        System.out.print("String without spaces"+result);
    }
    
}
