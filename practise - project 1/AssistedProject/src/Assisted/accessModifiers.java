package Assisted;
//default access modifiers
class modifiers
{
	void Simple()
	{
		System.out.println("Default Access Modifier");
	}
	
	//Protected access modifiers
	protected void Simple1()
	{
		System.out.println("Protected access modifier");
	}
	
	//Public access modifers
	 public void Simple2()
	 {
		 System.out.println("public access modifiers");
	 }
	//private access modifiers\
		private void Simple3()
		{
			
			System.out.println("private access modifier");
			
		}
}
class Access extends modifiers
{
	public void Simple4()
	{
		
		System.out.println("hi");
	}

}
public class accessModifiers {

	public static void main(String[] args)
	{
		modifiers m = new modifiers();
		Access A=new Access();
		m.Simple();
		m.Simple1();
		m.Simple2();
		//A.Simple3();
		A.Simple4();
	}

}
