import java.util.Scanner;
public class waptocreatevotingeligibilitysystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("===voting eligibility system===");
        System.out.print("enter your name");
String name=sc.nextLine();
System.out.print("enter your age");
int age=sc.nextInt();
if(age>=18){
    System.out.println(name+",you are eligible to vote");
}
else{
    System.out.println(name+", you are not eligible to vote");
    System.out.println("you can vote after"+" "+(18-age));
}

    }
    
}
