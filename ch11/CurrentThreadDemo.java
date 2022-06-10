// controlling the main thread
class CurrentThreadDemo	{
	public static void main(String[] args)	{
		Thread t = Thread.currentThread();
		
		System.out.println("Current thread: " + t);
		// output : [name of the thread, priority, name of group]
		
		// change the name of the thread
		t.setName("My thread");
		System.out.println("After the change: " + t);
		
		try	{
			for(int n = 5; n>0; n--)	{
				System.out.println(n);
				// sleep for a second or 1000 milisecond
				Thread.sleep(1000);
				//sleep method may throw an InterruptedException
				// this would happen if some other thread wanted to 
				// interrupt this sleeping one
			}
		}	catch (Exception e)	{
			System.out.println("Main thread inturrupted");
		}
	}
}