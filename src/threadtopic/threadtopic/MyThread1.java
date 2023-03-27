package threadtopic.threadtopic;

public class MyThread1 extends Thread
{
	// thread--job---run()
	public void run() 
	{
		System.out.println(" Hi, I am Thread----"+ Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		MyThread1 th4 = new MyThread1();
		MyThread1 th5 = new MyThread1();

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		// main---CALL STACK
		// th1---thread---CallStack(Execution Area)---run()
	}
}