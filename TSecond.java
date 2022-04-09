class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Value of i = " +i);
		}
	}
}
public class TSecond
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t1,t2;
		t1=new Thread(mt);
		t2=new Thread(mt);
		t1.start();
		t2.start();	
		
	}
}
	