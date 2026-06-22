import java.util.*;
public class waptosortwordsinlength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String input=sc.nextLine();
        String []words=input.split(" ");
        Arrays.sort(words,Comparator.comparingInt(String::length));
        System.out.print("words sorted by length"+" ");
        for(String word:words){
            System.out.println(word+" ");
        }
    }
    
}
