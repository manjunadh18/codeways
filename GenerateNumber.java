import java.util.Scanner;
import java.util.Random;
class GenerateNumber {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Random randomNum=new Random();

    int min=1;
    int max=100;
    int maxAttemp=10;
    int round=0;
    int score=0;
    
    System.out.println("Welcome to the Number Guessing Game");

    while(true){
      int targetNumber=randomNum.nextInt(max-min+1)+min;
      int attempts=0;
      System.out.println("Round "+(++round)+":Guess the number between "+min+" and "+max);
      while(attempts<maxAttemp){
         System.out.println("Enter the guess: ");
         int guess = sc.nextInt();
         attempts++;
         if (guess==targetNumber){
            System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
            score+=maxAttemp-attempts+1;
            break;
         }
         else if (guess < targetNumber){
            System.out.println("Too low! Try again");

         }
         else{
            System.out.println("Too high! Try again");
         }

      }
      System.out.println("Do you want to play again?(yes/no):");
      String playAgain=sc.next().toLowerCase();
      if(!playAgain.equals("yes")){
         System.out.println("Game over.Yout total score is: "+score);
         break;
      }
    }
    sc.close();
   } 
}
