package p2;
class OtherPackage	{
	OtherPackage()	{
		p1.Protection p = new p1.Protection();
		System.out.println("Other package constructor");
		
		System.out.println("n_pub = " + n_pub);
	}
}