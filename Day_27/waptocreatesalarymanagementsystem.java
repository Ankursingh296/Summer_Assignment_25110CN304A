import java.util.*;
class Employee{
    int id;
    String name;
    double basicSalary;
    double bonous;
    double deduction;
    Employee(int id,String name,double basicSalary,double bonous,double deduction){
        this.id=id;
        this.name=name;
        this.basicSalary=basicSalary;
        this.bonous=bonous;
        this.deduction=deduction;
    }
    double calculateSalary(){
        return basicSalary+bonous-deduction;
    }
    void display(){
        System.out.println("ID: "+id+",Name: "+name);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Bonous: "+bonous);
        System.out.println("Deduction: "+deduction);
        System.out.println("Total Salary: "+calculateSalary());
        System.out.println("-------------------");
    }
}
public  class waptocreatesalarymanagementsystem {
    public static void main(String[] args){
        ArrayList<Employee> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Salary management system---");
            System.out.println("1. add employee salary");
            System.out.println("2. display all salaries");
            System.out.println("3. exit");
            System.out.print("enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("enter name");
                    String name=sc.nextLine();
                    System.out.print("enter basic salary");
                    double basic=sc.nextDouble();
                    System.out.print("enter bonous");
                    double bonous=sc.nextDouble();
                    System.out.print("enter deduction");
                    double deduction=sc.nextDouble();
                    list.add(new Employee(id,name,basic,bonous,deduction));
                    System.out.println("employee salary added");
                    break;
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("no records found");

                        }else{
                            for(Employee e:list){
                                e.display();
                            }
                        }
                        break;
                        case 3:
                            System.out.println("existing program");
                            break;
                            default:
                                System.out.println("invalid choice");
            }

        }while(choice!=3);
    }
    
}
