import java.util.Scanner;

public class B3_9 {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("������һ����λ��:");
	  int number = in.nextInt();
	  
//	  ��λ��
	  int a = number % 10 ;
//	  ʮλ��
	  int b = number % 10 ;
	  	  
	  int A = (int)(Math.random() * 10);
	  int B = (int)(Math.random() * 10);
	  
	  if ( a == A && b == B)
	  {
		  System.out.println("���10000����");
	  }

	  else if ( ( a == A && b == B ) || ( a == B && b == A ) )
	  {
		  System.out.println("���3000����");
	  }
	  
	  else if  ( a == A || b == B || a == B || b == A ) 
	  {
		  System.out.println("���1000����");
	  }
	  
	  else
	  {
		  System.out.println("������˼������");
	  }
  }
}

 