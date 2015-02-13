import java.util.Scanner;

public class B3_5 {
  public static void main(String[] args) {
	  
	  System.out.print("请输入以英镑为单位的体重，以英尺为单位的身高：");
	  Scanner input = new Scanner(System.in);
	  double pound = input.nextDouble();
	  double inch = input.nextDouble();
	  
	  double kg = pound * 0.45359237;
	  double meter = inch * 0.0254;
	  
	  double BMI = kg / Math.pow(meter, 2);
	  System.out.println("你的BMI是" + BMI);
	  
	  if (BMI < 16)
	  {
		  System.out.println("严重偏轻");
	  }
	  else
	  {
		  if (BMI < 18)
		  {
			  System.out.println("偏轻");			  
		  }
		  else
		  {
			  if (BMI < 24)
			  {
				  System.out.println("正常体重");
			  }
			  else
			  {
				  if (BMI < 29)
				  {
					  System.out.println("超重");
				  }
				  else
				  {
					  if (BMI < 35)
					  {
						  System.out.println("严重超重");
					  }
					  else
					  {
						  System.out.println("非常严重超重");						 
					  }
				  }
			  }
		  }
	  }

  }
}

 