import java.util.Scanner;
public class waptocountevenandoddelementsinarray {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("the number of even elements in array is"+evencount);
        System.out.println("the number of odd elements in array is"+oddcount);
    }

}
