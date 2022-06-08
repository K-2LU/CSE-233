class Exc2	{
	public static void main(String[] args)	{
		int a, d;
		
		try	{
			d = 0;
			a = 42/0;
			System.out.println("This will not be printed");
		}	catch (ArithmeticException e)	{
			System.out.println("Division by zero");
		}
		System.out.println("After catch statement");
	}
}