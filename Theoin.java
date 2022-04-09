class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println("Value of I ="+i);
		}
	}
		
}	
public class Theoin 
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}
}