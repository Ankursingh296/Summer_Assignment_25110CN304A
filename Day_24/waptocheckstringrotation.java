import java.util.*;
public class waptocheckstringrotation {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string");
        String s1=sc.nextLine();
        System.out.print("enter second string");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.print("not a rotation");
        }
        else{
            String temp=s1+s1;
            if(temp.contains(s2)){
                System.out.print("it is a rotation");
            }
            else{
                System.out.print("not a rotation");
            }
        }
    }
}
