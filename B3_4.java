import java.util.Scanner;

public class B3_4 {
  public static void main(String[] args) {
	  
	  
	  int number1 = (int)(Math.random() * 10);
	  int number2 = (int)(Math.random() * 10);
	  int number = number1 - number2;
	  
	  if ( number1 < number2 )
	  {
		  System.out.println("what is " + number2 + " - " + number1 + " ?");
		  number = -number;
	  }
	  else
	  {
		  System.out.println("what is " + number1 + " - " + number2 + " ?");
	  }
	  
	  Scanner input = new Scanner(System.in);	  
	  int answer = input.nextInt();
	  
	  if (answer == number)
	  {
		  System.out.println("答对了,是" + number);		  
	  }
	  else
	  {
		  System.out.println("答错了,应该是" + number );
	  }
  }
}

 