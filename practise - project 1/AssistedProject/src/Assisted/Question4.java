package Assisted;
class Test
{
	Test()
	{
		System.out.println("this is a Constructor");
	}
	Test(int num1,int num2)
	{
		int c=num1-num2;
		System.out.println(c);
		
	}
}
public class Question4 
{

	public static void main(String[] args)
	{
		Test obj =new Test();
		Test obj1=new Test(7,2);
		
	}

}
