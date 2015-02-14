import java.util.Scanner;

public class B3_7 {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  int number = in.nextInt();
	  
	  if ( number % 2 == 0 && number % 3 == 0)
		  System.out.println(number + "可以被2和3整除");

	  if ( number % 2 == 0 || number % 3 == 0)
		  System.out.println(number + "可以被2或3整除");

	  if ( number % 2 == 0 ^ number % 3 == 0)
		  System.out.println(number + "可以被2异或3整除");
  }
}

 