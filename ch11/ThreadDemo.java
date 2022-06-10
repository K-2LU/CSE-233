class ThreadDemo	{
	public static void main(String args[])	{
		NewThread nt = new NewThread();	// create a new thread
		
		nt.t.start();	// start the thread
		
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println("Main thread: " + i);
				Thread.sleep(700);
			}
		} catch(InterruptedException ie)	{
			System.out.println("Main thread intertupted.");
		}
		
		System.out.println("Main thread exiting");
	}
}