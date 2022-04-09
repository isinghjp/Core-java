class MyThread extends Thread
{
	synchronized public void run()
	{
		for(int i=0; i<=100; i++)
		{
		System.out.println("Value of i ="+i);
		}
	}
}
public class Abca
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		
		t1.start();
		t2.start();
		t3.start();
	}
}