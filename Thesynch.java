
public class Thesynch 
{
	public static void main(String args[]) throws InterruptedException
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