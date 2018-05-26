import java.util.Scanner;
public class YoLo {

	public static void main(String[] args) {
		//TODO create a fun guess the number game.
		//GOTO the coding part 
		
		//#---------------------------------------------------------
		//Introduce the user to the game
		System.out.println("Welcome to guess the number");
		System.out.println("You will guess a number between 1 and 100");
		System.out.println("You will have an unlimited number of guesses");
		
		//Generate the random number for the user to guess 
		int theNum = (int)(Math.random() * 100 + 1);
		
		//Generate a variable to store the guess in
		int guess = 0;
		
		//Create a scanner object to store a users guess later 
		Scanner scan = new Scanner(System.in);
		
		//Create a while loop for the user to guess a number
		while (guess != theNum) {
			
			//Prompt the user to enter a guess 
			System.out.println("Please enter a number: ");
			guess = scan.nextInt();
			
			if (guess > theNum)
				System.out.println("That guess is too high!\n");
			
			else if (guess < theNum)
				System.out.println("That guess is too low!\n");
			
			else
				System.out.println("That guess is correct!");
			//End of program
		}
		}

	}


