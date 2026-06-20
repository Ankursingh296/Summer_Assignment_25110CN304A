import java.util.Scanner;
public class waptofindfirstnonrepeatingcharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                System.out.print("first non repeating character"+" "+ch);
                return;
            }
        }
        System.out.print("no non repeating character found");
    }
    
}
