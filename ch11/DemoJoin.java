class DemoJoin	{
	public static void main(String[] args)	{
		NewThread2 nt1 = new NewThread2("uno");
		NewThread2 nt2 = new NewThread2("dos");
		NewThread2 nt3 = new NewThread2("tres");
		
		// start the threads
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		System.out.println("Thread Uno is alive: " + nt1.t.isAlive());
		System.out.println("Thread Dos is alive: " + nt2.t.isAlive());
		System.out.println("Thread Tres is alive: " + nt3.t.isAlive());
		
		// wait for threads to finish
		try	{
			
		System.out.println("Waiting for the threads to finish");
		nt1.t.join();
		nt2.t.join();
		nt3.t.join();
		
		}	catch (InterruptedException ie)	{
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread Uno is alive: " + nt1.t.isAlive());
		System.out.println("Thread Dos is alive: " + nt2.t.isAlive());
		System.out.println("Thread Tres is alive: " + nt3.t.isAlive());
		
		
		System.out.println("Main thread exiting");
	}
}