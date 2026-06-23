import java.util.Scanner;
import java.util.Random;
public class waptocreatenumberguessinggame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int numberToGuess=rand.nextInt(100)+1;//random number between 1-100
  int userGuess=0;
  int attempts=0;
  System.out.println("=== number guessing game ===");
System.out.println("guess a number between 1 and 100");
while(userGuess!=numberToGuess){
    System.out.print("enter your guess");
    userGuess=sc.nextInt();
    attempts++;
    if(userGuess<numberToGuess){
        System.out.println("too low! try again");
    }
    else if(userGuess>numberToGuess){
        System.out.println("too high! try again");
    }
    else{
        System.out.println("correct! you guessed the number in"+ attempts+"attempts");
    }
}   
}
    
}
