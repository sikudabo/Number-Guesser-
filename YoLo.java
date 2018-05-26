//Import the scanner class to get user input
import java.util.Scanner;
public class YoLo {

	public static void main(String[] args) {
		//TODO create a fun guess the number game.
		//GOTO the coding part 
		System.out.println("Welcome to guess the number!");
		System.out.println("You can guess a number from 1-100");
		System.out.println("You will have 8 tries");
		
		//Create a scanner object to store user input
		Scanner scan = new Scanner(System.in);
		
		//Create an empty variable to prompt the user to play again
		//Set the guess to zero 
		//Set the attemps counter to 0
		String playAgain = "";
		int guess = 0;
		
		
		//Start the do-while loop
		do {
			//Create the random number 
			int theNumber = (int)(Math.random() * 100 + 1);
			int attempts = 8;
			//Now start the while loop 
			while (guess != theNumber) {
				System.out.println("Attempts remaining: " + attempts);
				System.out.println("Enter a number");
				guess = scan.nextInt();
				
				if (guess < theNumber)
					System.out.println("The number " + guess + " is too low.");
				
				else if (guess > theNumber)
					System.out.println("The number " + guess + " is too high");
			
				else 
					System.out.println("That is the right number!\n");
				attempts = attempts - 1;
				if (attempts == 0)
					break;
				}
		if (attempts == 0 & guess != theNumber)
			System.out.println("You lose!\n");
		System.out.println("Do you want to play again? (y/n)");
		playAgain = scan.next();
	   }while (playAgain.equalsIgnoreCase("y"));
	}
}


