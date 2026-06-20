import java.util.Scanner;
import java.util.HashMap;
public class waptofindmaximumoccuringcharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        HashMap<Character, Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char maxChar=' ';
        int maxcount=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>maxcount){
                maxcount=map.get(ch);
                maxChar=ch;
            }
        }
        System.out.println("maximum occuring character"+" "+maxChar);
System.out.println("frequency"+" "+maxcount);
    }
    
}
