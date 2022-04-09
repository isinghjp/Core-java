
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.*;


class MeThread extends Thread
{
	public void run()
	{
		try
		{
			File f=new File("abc.text");
			FileWriter fw=new FileWriter(f);
			fw.write("Hello");
			fw.write("Welcome");
			fw.flush();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class ConCurrent {
	public static void main(String args[]) throws Exception
	{
		MeThread nt=new MeThread();
		ThreadPoolExecutor tpe= new ThreadPoolExecutor(20,100,1000l, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100));
		tpe.execute(nt);
	}

}
