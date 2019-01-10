
public class Fraction
{
	private int numer;
	private int denom;
	public int i;




	public Fraction(  )
	{
		numer = 0;
		denom = 1;
	}
	public String toString()
	{
		return numer + "/" + denom;
	}
	public Fraction( int n )
	{
		numer = n;
		denom = 1;
	}
	public Fraction( int n, int d )
	{
		numer = n;
		denom = d;
		reduce();
	}
	public void setNumer(int n)
	{
		numer = n;
	}
	public void setDenom(int d)
	{
		if (d == 0)
		{
			denom =1;
		}

		else
		{
			denom =d;
			}
	}
	public int gcd(int n, int d)
	{
   if (d==0) return n;
   	return gcd(d,n%d);
		}
	public int getDenom(){
				return denom;
		}
	public int getNumer(){
		return numer;
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
	private void reduce()
	{
		 i = numer;
		 i = numer / gcd(numer,denom);
		 denom = denom/ gcd(numer,denom);
		 numer = i;
	}

}
