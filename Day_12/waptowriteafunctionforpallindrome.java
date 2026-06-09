import java.util.Scanner;
public class waptowriteafunctionforpallindrome{
    public static boolean isPalindrome(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return str.equals(reversed);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        if(isPalindrome(str)){
System.out.print("the string  is a pallindrome");

        }
        else{
            System.out.print("the string is not a pallindrome");
        }
    }
}