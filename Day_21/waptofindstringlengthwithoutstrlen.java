import java.util.Scanner;
public class waptofindstringlengthwithoutstrlen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        int count=0;
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            count++;
        }
        System.out.print("length of string"+count);


    }
}