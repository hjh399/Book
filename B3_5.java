import java.util.Scanner;

public class B3_5 {
  public static void main(String[] args) {
	  
	  System.out.print("��������Ӣ��Ϊ��λ�����أ���Ӣ��Ϊ��λ����ߣ�");
	  Scanner input = new Scanner(System.in);
	  double pound = input.nextDouble();
	  double inch = input.nextDouble();
	  
	  double kg = pound * 0.45359237;
	  double meter = inch * 0.0254;
	  
	  double BMI = kg / Math.pow(meter, 2);
	  System.out.println("���BMI��" + BMI);
	  
	  if (BMI < 16)
	  {
		  System.out.println("����ƫ��");
	  }
	  else
	  {
		  if (BMI < 18)
		  {
			  System.out.println("ƫ��");			  
		  }
		  else
		  {
			  if (BMI < 24)
			  {
				  System.out.println("��������");
			  }
			  else
			  {
				  if (BMI < 29)
				  {
					  System.out.println("����");
				  }
				  else
				  {
					  if (BMI < 35)
					  {
						  System.out.println("���س���");
					  }
					  else
					  {
						  System.out.println("�ǳ����س���");						 
					  }
				  }
			  }
		  }
	  }

  }
}

 