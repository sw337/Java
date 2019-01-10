
public class Fraction
{
	private int numer;
	private int denom;

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
			System.out.println("You can't do that my friend.");
		}
	}

	// DEFAULT CONSTRUCTOR - no args passed in
	public Fraction(  )
	{
		this( 0, 1 );
		reduce();
	}

	public Fraction( int n )
	{
		this( n, 1 );
		reduce();
	}

	public Fraction( int n, int d )
	{
		setNumer(n);
		setDenom(d);
		reduce();
	}
	public Fraction( Fraction other )
	{
		this( other.numer, other.denom );
	}

	private void reduce()
	{
	 int i = numer;
	 i = numer / gcd(numer,denom);
	 denom = denom/ gcd(numer,denom);
	 numer = i;
	}

	public int gcd(int n, int d)
		{
		 if (d==0) return n;
			return gcd(d,n%d); // recursion :-)
			}

	public Fraction reciprocal()
		{
			return new Fraction(this.getDenom(), this.getNumer());
		}

	public Fraction add(Fraction other)
	{
		return new Fraction (
		this.getNumer() * other.getDenom() + this.getDenom() * other.getNumer(),
		 this.getDenom() * other.getDenom());
	}

	public Fraction subtract(Fraction other)
		{
			return new Fraction (
			this.getNumer() * other.getDenom() - this.getDenom() * other.getNumer(),
			 this.getDenom() * other.getDenom());
		}

	public Fraction multiply(Fraction other)
	{
		return new Fraction (this.getNumer()* other.getNumer(), this.getDenom()*other.getDenom());
	}

	public Fraction divide(Fraction other)
	{
		return new Fraction (this.getNumer()* other.getDenom(), this.getDenom()*other.getNumer());
	}

}
