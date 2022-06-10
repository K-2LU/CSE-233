class ExtendThread	{
	public static void main(String[] args)	{
		NewThread1 nt1 = new NewThread1();
		//NewThread1 nt2 = new NewThread1("two", 5);
		//NewThread1 nt3 = new NewThread1("three", 1);
		
		nt1.start();	// start the thread;
		//nt2.start();	// start the thread;
		//nt3.start();	// start the thread;
		
		try	{
			for (int i = 5; i > 0; i--)	{
				System.out.println("Main thread: " + i);
				Thread.sleep(600);
			}
		}	catch (InterruptedException ie)	{
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Exiting main thread");
	}
}