class NewThread1 extends Thread	{
	
	NewThread1(String name, int priority)	{
		// create a new, second thread
		super(name);
		this.setPriority(priority);
		System.out.println("Child thread: " + this);
	}
	
	// the extending class must override run() method
	public void run()	{
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println("Child Thread: (" + getName() + ") : " + i);
				Thread.sleep(500);
			}
		}	catch	(InterruptedException ie)	{
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
		
	}
}