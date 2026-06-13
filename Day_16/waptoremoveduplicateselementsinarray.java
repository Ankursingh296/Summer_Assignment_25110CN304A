import java.util.Scanner;
public class waptoremoveduplicateselementsinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the unique elements in array are");
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    break;
                }
            }
            if(c!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
