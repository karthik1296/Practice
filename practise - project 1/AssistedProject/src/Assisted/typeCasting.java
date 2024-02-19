package Assisted;

public class typeCasting {

	public static void main(String[] args) 
	{
		//implicit type casting
		int a=5;
		System.out.println("value of a:" +a );
		
		float b=a;
		System.out.println("value of b:"+b);
		
		//explicit type casting
		
		float C=9f;
		System.out.println("value of c:" +C);
		int D= (int)C;
		System.out.println("value of D:"+D);
		
		char ch='D';
		System.out.println("value of ch:" +ch);
		double num= (double)ch;
		System.out.println("value of num:"+num);
		
	}

}
