// creating a second thread by extending Thread
class NewThread1 extends Thread	{
	
	NewThread1()	{
		// create a new, second thread
		super("Demo thread");
		System.out.println("Child thread: " + this);
	}
	
	// entry point for the second thread
	public void run()	{
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		}	catch	(InterruptedException ie)	{
			System.out.println("Child thread interrupted");
		}
		
		System.out.println("Exiting child thread.");
	}
}