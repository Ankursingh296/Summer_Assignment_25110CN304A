import java.util.Scanner;
public class waptocreateatmsimulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=1000.0;
        int choice;
     do{   
        System.out.print("\n====ATM MENU ====");
    System.out.println("1. check balance");
    System.out.println("2. deposit");
    System.out.println("3. withdraw");
    System.out.println("4. exit");
    System.out.print("enter your choice");
    choice =sc.nextInt();
    switch(choice){
        case 1:
            System.out.println("your balance: rs"+balance);
            break;
            case 2:
                System.out.print("enter amount to deposit:");
                double deposit=sc.nextDouble();
                if(deposit>0){
                    balance+=deposit;
                    System.out.println("deposit successful");
                }
                else{
                    System.out.println("invalid amount");
                }
                break;
                case 3:
                System.out.print("enter amount to withdraw:");
                double withdraw=sc.nextDouble();
                if(withdraw>0&&withdraw<=balance){
                    balance-=withdraw;
                    System.out.println("withdrawal successful!");

                }
                else{
                    System.out.println("insufficient balance or invalid amount");
        
                }
                break;
                case 4:
                    System.out.println("thank you for using atm!");
                    break;
                    default:
                        System.out.println("invalid choice!ntry again");

    }
    }while(choice!=4);

    }
    
}
