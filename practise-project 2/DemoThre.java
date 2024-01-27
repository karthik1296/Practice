package Assisted;

class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread"+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}
class MultiThread
{
	public void sample(String name) throws InterruptedException
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Thread" +name);
				this.wait(1000);
			}
		}
	}
	
}

	

public class DemoThre 
{

	public static void main(String[] args) throws InterruptedException
	{
		ThreadDemo thr=new ThreadDemo();
		thr.start();
		MultiThread mt=new MultiThread();
		mt.sample("Dev");

	}

}
