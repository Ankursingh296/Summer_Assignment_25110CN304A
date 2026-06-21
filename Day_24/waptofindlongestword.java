import java.util.*;
public class waptofindlongestword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String s=sc.nextLine();
        String []words=s.split(" ");
        String longest="";
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.print("longest word"+" "+longest);
    }
    
}
