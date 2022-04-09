class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<=1000; i++)
		{
			System.out.println(i);
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		t.setDaemon(true);
	}
}