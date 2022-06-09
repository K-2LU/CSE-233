// create a second thread
class NewThread implements Runnable	{
	Thread t;
	
	NewThread()	{
		// Create a new, second thread
		t = new Thread(this, "Demo thread");
		System.out.println("Child thread" + t);
	}
	
	// this is the entry point for the second thread
	public void run()	{
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}	catch(InterruptedException ie)	{
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread"); 	
	}
}