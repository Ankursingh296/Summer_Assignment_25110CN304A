import java.util.*;
public class waptoremoveduplicatecharacters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String s=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(result.indexOf(String.valueOf(ch))==-1){
                result.append(ch);
            }
        }
        System.out.print("after removing duplicates element"+" "+result);
    }
    
}
