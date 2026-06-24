import java.util.*;
class Student{
    int id;
    String name;
    int marks;
    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("ID: "+id+" NAME: "+name+" MARKS: "+marks);
    
    }

}
public class waptocreatestudentrecordmanagementsystem {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> list=new ArrayList<>();
    int choice;
    do{
        System.out.println("\n--- student record management system---");
        System.out.println("1. add student");
         System.out.println("2. display student ");
 System.out.println("3. search student");
 System.out.println("4. delete student");
 System.out.println("5. exit");
 System.out.print("enter choice: ");
 choice=sc.nextInt();
 switch(choice){
    case 1:
        System.out.print("enter id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("enter name");
        String name=sc.nextLine();
        System.out.print("enter marks");
        int marks=sc.nextInt();
        list.add(new Student(id,name,marks));
        System.out.println("student added");
        break;
        case 2:
            if(list.isEmpty()){
                System.out.println("no students found");
            }
            else{
                for(Student s:list){
                    s.display();
                }
            }
            break;
            case 3:
                System.out.print("enter id to search");
                int searchId=sc.nextInt();
                boolean found=false;
                for(Student s: list){
                    if(s.id==searchId){
                        s.display();
                        found=true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("student not found");
                }
                break;
                case 4:
                    System.out.print("enter id to delete");
                    int deleteId=sc.nextInt();
                    boolean removed=false;
                    Iterator<Student> it=list.iterator();
                    while(it.hasNext()){
                        Student s=it.next();
                        if(s.id==deleteId){
                            it.remove();
                            removed=true;
                            System.out.println("student deleted");
                            break;
                        }
                    } 
                    if(!removed){
                        System.out.println("student not found");
                    }
                    break;
                    case 5:
                        System.out.println("existing");
                        break;
                        default:
                            System.out.println("invalid choice");
 }


    }while(choice!=5);
}

    
}
