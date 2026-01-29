package Abirami;

public class PracThread  extends Thread
{
public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Thread is running");
	}
public static void main(String[] args)
{
	PracThread t= new PracThread();
t.start();
}
}
