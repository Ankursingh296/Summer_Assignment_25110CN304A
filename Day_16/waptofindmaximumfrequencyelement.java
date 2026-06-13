import java.util.Scanner;
public class waptofindmaximumfrequencyelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int freq=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>freq){
                freq=count;
                max=arr[i];
            }
        }
        System.out.println("the maximum frequency element is"+max);
        System.out.print("the freuency of the element is"+freq);
    
    }
    
}
