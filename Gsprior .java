class MyThread extends Thread 
{
	public void run()
	{
		System.out.println(" Name of Thread ="+ Thread.currentThread().getPriority());
	}
}	
public class Gsprior 
{
	public static void main(String args[]) 
	{
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		t1.setPriority(7);
		t1.start();
	}
}