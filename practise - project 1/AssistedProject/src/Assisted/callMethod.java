package Assisted;

class Method
{
	public void Addition(int a, int b)
	{
		int c= a+b;
		System.out.println("c:" +c);
	}
}
public class callMethod 
{
	public static int substraction()
	{
		int num1=9,num2=6;
		int ans=num1-num2;
		return ans;
				
	}

	public static void main(String[] args)
	{
		Method c= new Method();
		c.Addition(10,67);
		System.out.println("ans is:" + substraction());
	}

}
