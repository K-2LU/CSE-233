class MultiThreadDemo	{
	public static void main(String[] args)	{
		NewThread2 nt1 = new NewThread2("Uno");
		NewThread2 nt2 = new NewThread2("Dos");
		NewThread2 nt3 = new NewThread2("Tres");
		
		// start the threads
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		try	{
			// wait for the other threads to end
			Thread.sleep(10000);
		}	catch (InterruptedException ie)	{
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Main thread exiting");
	}
}