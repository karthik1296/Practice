package Assisted;

class SharedResources
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good morning"+" " +name);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
}
class sync1 extends Thread
{
	private String name;
	private SharedResources sr;

	public void simple(String name,SharedResources sr)
	{
		this.name=name;
		this. sr =sr;
	}
	public void run()
	{
		sr.wish(name);
	}
}
public class SynchronizedDm 
{
	public static void main(String[] args)
	{
		SharedResources sr=new SharedResources();
		sync1 s1=new sync1();
		s1.simple("karthik",sr);
		s1.start();
		sync1 s2=new sync1();
		s2.simple("janu",sr);
		s2.start();
	}

}
