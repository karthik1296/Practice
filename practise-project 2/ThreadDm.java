package Assisted;

class DemoTh extends Thread
{
	
	public void run()
	{
		System.out.println("multi Threading using extends Thread:");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread-A" +i);
		}
						
	}		
		
}
class DemoTh1 extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread-B" +i);
		}
				
	}
}
class DemoThr implements Runnable
{
	public void run()
	{
		System.out.println("multi Threading using implements Runnable");
	}
}
public class ThreadDm 
{

	public static void main(String[] args)
	{
		DemoTh th = new DemoTh();
		DemoTh1 th1 = new DemoTh1();
		DemoThr Thr=new DemoThr();
		Thread Thr1= new Thread(Thr);
		
		
		th.start();
		th1.start();
		
		Thr1.start();
		
	}

}
