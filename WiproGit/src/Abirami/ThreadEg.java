package Abirami;
public class ThreadEg extends Thread{

public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		// it tells whteer main thread or child thread 
			//run thread always excute child thread
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}}
	}
public static void main(String[] args)
{
	ThreadEg t1=new  ThreadEg();
	ThreadEg t2=new  ThreadEg();

	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
		t1.start();
		t2.start();
 
}
 
}

