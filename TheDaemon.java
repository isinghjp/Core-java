class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println("Value of I="+i);
		}
	}
}	
public class TheDaemon
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		t1.start();
		t1.setDaemon(true);
	}
}