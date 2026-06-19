import java.util.Scanner;
public class waptocountwordsinastring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String str=sc.nextLine();
        str=str.trim();//trim to remove extra spaces at start and end
        String[]words=str.split("\\s+");//split by one or more spaces
        int count=words.length;
        System.out.print("number of words"+count);
    }
    
    
}
