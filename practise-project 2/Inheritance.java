package Assisted;

class DemoBase
{
	protected int a,b;
	
	public void getdata(int a, int b)
	{
		this.a = a;
		this.b = b;
	
	}
}
class DemoBase1 extends DemoBase
{
	private int c;
	
	public void putdata()
	{
	    c = a*b;
	    System.out.println("a value is " + a);
	    System.out.println("b value is " + b);
	    System.out.println("a value is " + c);
	}

}
public class Inheritance {

	public static void main(String[] args) {
	
		DemoBase1 db1 = new DemoBase1();
		db1.getdata(3,5);
		db1.putdata();
		

	}

}


