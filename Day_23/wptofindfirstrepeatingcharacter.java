import java.util.Scanner;
import java.util.HashSet;
public class wptofindfirstrepeatingcharacter {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        HashSet<Character>set=new HashSet<>();
        char repeatingChar='\0';
        boolean found=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(set.contains(ch)){
                repeatingChar=ch;
                found=true;
                break;

            }else{
                set.add(ch);
            }
        }
        if(found){
            System.out.print("first repeating character"+" "+repeatingChar);
        }
        else{
            System.out.print("no repeating character found");
        }
    }
    
}
