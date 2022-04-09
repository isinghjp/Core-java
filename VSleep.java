class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<=100;i++)
			{
				System.out.println("Value of i = " +i);
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class VSleep
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
	}
}
