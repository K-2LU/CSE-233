// create multiple threads
class NewThread2 implements Runnable	{
	String name; // name of the thread
	Thread t;
	
	NewThread2 (String threadName)	{
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
	}
	
	// entry point for the thread
	public void run()	{
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}	catch (InterruptedException ie)	{
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " exiting");
	}
}