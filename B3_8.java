import java.util.Scanner;

public class B3_8 {
  public static void main(String[] args) {
	  
	  System.out.print("����������:");
	  
	  Scanner in = new Scanner(System.in);
	  int year = in.nextInt();
	  
	  boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0);
	  
	  if (isLeapYear)
	  {
		  System.out.println("������");
	  }
	  else
	  {
		  System.out.println("��������");
	  }
	  
  }
}

 