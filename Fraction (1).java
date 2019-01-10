/* Fraction.java  A class (data type) definition file
   This file just defines what a Fraction is
   This file is NOT a program
   ** data members are PRIVATE
   ** method members are PUBLIC
*/
public class Fraction
{
	private int numer;
	private int denom;

	// ACCESSORS
	public int getNumer()
	{
		return numer;
	}
	public int getDenom()
	{
		return denom;
	}
	public String toString()
	{
		return numer + "/" + denom;
	}

	// MUTATORS
	public void setNumer( int n )
	{
		numer = n;
	}
	public void setDenom( int d )
	{
		if (d!=0)
			denom=d;
		else
		{
			// error msg OR exception OR exit etc.
		}
	}

	// DEFAULT CONSTRUCTOR - no args passed in
	public Fraction(  )
	{
		this( 0, 1 ); // "this" means call a fellow constructor
	}

	// 1 arg CONSTRUCTOR - 1 arg passed in
	// assume user wants whole number
	public Fraction( int n )
	{
		this( n, 1 ); // "this" means call a fellow constructor

	}

	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{
		// you COULD calc the gcd(n,d) here and then divide both by gcd in the setter calls
		setNumer(n); // i.e. setNumer( n/gcd );
		setDenom(d); // same here
	}

	// COPY CONSTRUCTOR - takes ref to some already initialized Fraction object
	public Fraction( Fraction other )
	{
		this( other.numer, other.denom ); // call my full C'Tor with other Fraction's data
	}

	private void reduce()
	{
	 int i = numer;
	 i = numer / gcd(numer,denom);
	 denom = denom/ gcd(numer,denom);
	 numer = i;
	}

	//  W R I T E   A L L   Y O U R   N E W   M E T H O D S   A T   B O T T O M   O F   F I L E   R E M O V E   A L L   C O M M E N T S


}// EOF
