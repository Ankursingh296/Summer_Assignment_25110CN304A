import java.util.Scanner;
public class waptofindcommoncharacterinastring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a first string");
        String str1=sc.nextLine();
        System.out.print("enter second string");
        String str2=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    System.out.print(str1.charAt(i)+" ");
                    break;
                }
            }
        }
    }
    
}
