import java.util.Scanner;
public class waptocharacterfrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int []freq=new int[256];//for all ascii characters
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        System.out.print("character frequency");
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                System.out.println((char)i+":"+freq[i]);
            }
        }
    }
    
}
