import java.util.*;
class employee{
    int id;
    String name;
    double salary;
    employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("ID: "+id+",NAME: "+name+",Salary: "+salary);
    }
}
public class waptocreateemploymanagementsystem {
    public static void main(String[] args){
        ArrayList<employee> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- employee management system ");
            System.out.println("1. add employee");
            System.out.println("2. display employees");
            System.out.println("3. search employee");
            System.out.println("4. exit");
            System.out.print("enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter id");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter name");
                    String name=sc.nextLine();
                    System.out.print("enter salary");
                    double salary=sc.nextDouble();
                    list.add(new employee(id,name,salary));
                    System.out.println("employee added");
                    break;
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("no employees added");
                        }
                        else{
                            for(employee e:list){
                                e.display();
                            }
                        }
                        break;
                        case 3:
                            System.out.print("enter id to search");
                            int searchId=sc.nextInt();
                            boolean found=false;
                            for(employee e:list){
                                if(e.id==searchId){
                                    e.display();
                                    found=true;
                                    break;
                                }
                            }
                            if(!found){
                                System.out.println("employee not found");
                            }
                            break;
                            case 4:
                                System.out.println("exiting");
                                break;
                                default:
                                    System.out.println("invalid choice!");
            }
        }while(choice!=4);
    }
    
}
