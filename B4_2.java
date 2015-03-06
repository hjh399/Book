import java.util.Scanner;

public class B4_2 {
  public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Guess a magic number between 0 and 100");
	  
	  int number = (int)(Math.random() * 101);
	  int guess = -1;
	  
	  while (guess != number) 
	  {
		  System.out.print("Enter your guess: ");		  
		  guess = input.nextInt();
		  if (guess < number)
		  {
			  System.out.println("Your guess is too low");
		  }
		  else if (guess > number)
		  {
			  System.out.println("Your guess is too high");
		  }
		  else 
		  {
			  System.out.println("Yes, the number is " + number);
		  }
	  }
	  
  } 
}