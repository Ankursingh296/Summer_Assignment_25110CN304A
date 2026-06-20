import java.util.Scanner;
import java.util.Arrays;
public class waptocheckanagramstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string");
        String str1=sc.nextLine();
        System.out.print("enter second string");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("string are anagrams");
        }
        else{
            System.out.print("string are not anagrams");
        }

    }
    
}
