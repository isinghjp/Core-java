class MyThr extends Thread 
{
	public void run()
	{
	synchronized(MyThread.class)
		{
		for(int i=0; i<=50; i++)
			{
			System.out.println("Value of I ="+i);
			}
		}
	}

}	
public class Demo 
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThr mt=new MyThr();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);

		t1.start();
		t2.start();
		t3.start();
	}
}