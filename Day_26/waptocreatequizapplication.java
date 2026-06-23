import java.util.Scanner;
public class waptocreatequizapplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int score=0;
        String[]questions={
            "1. what is capital of india?",
            "2. which language is used for android development?",
            "3. what is 2+2?",
            "4. which keyword is used to inherit a class in java?"
        };
        String[][]options={
            {"A. mumbai","B. delhi","C. kolkata","D. chennai"},
            {"A.python","B. java","C. c++","D. HTML"},
            {"A. 3","B. 4","C. 5","D. 6"},
            {"A. this","B. super","C. extends","D. implements"}
        };
        char []answers={'B','B','B','C'};
        //QUIZ LOOP
        for(int i=0;i<questions.length;i++){
            System.out.println("\n"+questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.print("enter your answer (A/B/C/D):");
            char userAnswer=sc.next().toUpperCase().charAt(0);
            if(userAnswer==answers[i]){
                System.out.println("correct");
                score++;
            }else{
                System.out.println("wrong ! correct answer:"+answers[i]);
            }
        }
        System.out.println("\n==== result=====");
        System.out.println("your score:"+score+"/"+questions.length);
    }
    
}
