/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;

public class Coin
{
  private char orentation;
  private int b, c, d, f;
  private Random rand;
  public Coin(int a)
  {
      rand = new Random(a);
  }
    public void setO()
    {
      b = rand.nextInt(2);
      if (b == 0)
      {

        orentation = 'T';
        tailsCount();
      }
      else
      {
        orentation = 'H';
        headsCount();
      }
    }
    public char flip()
      {
        setO();
        return orentation;
      }

      public void tailsCount()
      {
        d = d+1;
      }
      public void headsCount()
      {
        c = c+1;
      }
      public int getNumTails( )
      {
        return d;
      }
      public int getNumHeads()
      {
        return c;
      }
      public void reset()
      {
        d =0;
        c = 0;
      }

  }



 // END COIN CLASS
