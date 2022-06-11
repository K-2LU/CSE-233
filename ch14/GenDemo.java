class Gen<T>	{
	T ob;	// declare an object of type T
	
	Gen(T o)	{
		ob = o;
	}
	
	T getOb()	{
		return ob;
	}
	
	void showType()	{
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

// demonstrate the generic class
class GenDemo	{
	public static void main(String[] args)	{
		// Gen reference for integers
		Gen <Integer> iOb;
		
		iOb = new Gen<Integer> (99);
		iOb.showType();
		
		int v = iOb.getOb(); // no typecast needed
		System.out.println("Value: " + v);
		
		System.out.println();
		
		// Gen object for Strings
		Gen <String> strObj = new Gen <String> ("Generics test");
		
		strObj.showType();
		String str = strObj.getOb();
		
		System.out.println("Value: " + str);
	}
}