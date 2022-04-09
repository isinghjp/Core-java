class MyThread extends Thread
{
	public void run()
	{
		System.out.println("H. M. Tyagi");
		System.out.println("Himanshu");
		System.out.println("Prashant");
		System.out.println("Ayush");

			
	}
}
public class TFrist
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		
	}
}