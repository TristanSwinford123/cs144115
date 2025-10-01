import java.util.Random;
import java.util.Scanner;

public class randomnum {
   public static void main(String[] args) {
         

      Scanner myObj = new Scanner(System.in);
      Random randomNum = new Random(); // 0 to 100
      int sumRanoNum = randomNum.nextInt(100);

      int Guess = (-1);

      
     while(sumRanoNum != Guess){
        System.out.println("guess");
        Guess =myObj.nextInt();
        if(Guess < sumRanoNum){
          System.out.println("too low");
        }

        if(Guess > sumRanoNum){
          System.out.println("too high");
        }

        if(Guess == sumRanoNum){
          System.out.println("correct!");
        }
     }
    }
 }    
        

    

