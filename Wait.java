public class Wait extends Thread
 {
	static Wait w = null;
	synchronized public void run()
	{
		System.out.println("Before wait");
		try
		{
			w.wait();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("After wait");
	}
	public static void main(String args[]) throws Exception
	{
		w=new Wait();
		w.start();
	}
}
