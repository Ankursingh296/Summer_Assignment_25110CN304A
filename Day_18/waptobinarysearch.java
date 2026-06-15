import java.util.Scanner;
public class waptobinarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter element to be search");
        int m=sc.nextInt();
        int low=0;
        int high=n-1;
        int found=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==m){
                found=mid;
                break;
            }
            else if(a[mid]<m){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        if(found!=-1){
            System.out.println("element found at index"+found);
        }
        else{
            System.out.print("element not found");
        }
    }
    
}
