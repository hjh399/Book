import java.util.Scanner;

public class B3_9 {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("请输入一个两位数:");
	  int number = in.nextInt();
	  
//	  个位数
	  int a = number % 10 ;
//	  十位数
	  int b = number % 10 ;
	  	  
	  int A = (int)(Math.random() * 10);
	  int B = (int)(Math.random() * 10);
	  
	  if ( a == A && b == B)
	  {
		  System.out.println("获得10000美金");
	  }

	  else if ( ( a == A && b == B ) || ( a == B && b == A ) )
	  {
		  System.out.println("获得3000美金");
	  }
	  
	  else if  ( a == A || b == B || a == B || b == A ) 
	  {
		  System.out.println("获得1000美金");
	  }
	  
	  else
	  {
		  System.out.println("不好意思，不中");
	  }
  }
}

 