class MyThread extends Thread
{
	synchronized public void run()
	{
		for(int i=0; i<=10; i++)
		{
		System.out.println("Value of i ="+i);
		}
	}
}
public class Synmeth
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		
		t1.start();
		t2.start();
		t3.start();
	}
}