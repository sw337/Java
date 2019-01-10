
/*
	FractionTester.java  A program that declares Fraction variables
*/
public class FractionTester
{
	public static void main( String args[] )
	{
		Fraction f1 = new Fraction(22, 7);
		Fraction f2 = f1.reciprocal();
		Fraction f3 = f1.multiply(f2);
		Fraction f4 = f1.subtract(f2);
		Fraction f5 = f3.add(f1);




		System.out.println("f1=" + f1.getNumer() + "/" + f1.getDenom());
		System.out.println("f2=" + f2.getNumer() + "/" + f2.getDenom());
		System.out.println("f3=" + f3.getNumer() + "/" + f3.getDenom());
		System.out.println("f4=" + f4.getNumer() + "/" + f4.getDenom());
		System.out.println("f5=" + f5.getNumer() + "/" + f5.getDenom());
	}
}
