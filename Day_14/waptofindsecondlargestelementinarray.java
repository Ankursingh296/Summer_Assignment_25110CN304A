import java.util.Scanner;
public class waptofindsecondlargestelementinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest=arr[i];
            }
            }
            if(secondlargest==Integer.MIN_VALUE){
                System.out.print("there is no second largest element");

            }
            else{
                System.out.print("second largest element is"+secondlargest);

            }

        }

    }
    

