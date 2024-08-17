

import java.util.*;
public class NumberGuess {  
    public static void playGame() {  
        Scanner scanner = new Scanner(System.in);  
        int secretNumber = 1 + (int)(100 * Math.random());  
        int maxAttempts = 10;  
        int attempts, guess;  
        System.out.println("GUESS THE NUMBER!");  
        System.out.println(" choose a number between 1 and 100.");  
        System.out.println("YOU HAVE ONLY 10 CHANCES");  
        for (attempts = 0; attempts < maxAttempts; attempts++) {  
             System.out.println("Attempt No " + (attempts + 1) + ": Enter your guess:");  
            guess = scanner.nextInt();   
            if (secretNumber == guess) {  
                System.out.println("Congratulations! You've guessed the correct number in "+(attempts+1)+" chance");  
                break;  
            } else if (secretNumber > guess && attempts != maxAttempts-1) {  
                 System.out.println("The secret number is greater than your guess.");
                System.out.println("You are left out with "+ (maxAttempts-(attempts+1))+" chances");   
            } else if (secretNumber < guess && attempts != maxAttempts - 1) {  
                 
                System.out.println("The secret number is less than your guess.");
                System.out.println("You are left out with "+ (maxAttempts-(attempts+1))+" chances");   
            }  
            
        }  
        
        if (attempts == maxAttempts) {  
            System.out.println("You have exhausted all " + maxAttempts + " attempts.");  
            System.out.println("The secret number was " + secretNumber);  
        } 
        
        
    }  
    public static void main(String args[]) {  
        playGame();  
    }  
}  