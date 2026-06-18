import java.util.Scanner;
public class waptocountvowelsandconstonants {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string ");
        String str=sc.nextLine();
        char []ch=str.toCharArray();
        int countv=0;
     int   countc=0;
     for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
countv+=1;
        }
        else{
            countc+=1;
        }
     }
     System.out.print("no of vowels is"+countv);
     System.out.print("no of constonants is"+countc);

     }

    }
    

