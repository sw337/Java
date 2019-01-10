import java.util.*;
import java.io.*;

public class Parts
{
	public static void main( String[] args ) throws Exception
	{
		// - - - - - - - - - - - - - - - - - STEP #1: first map: Part #  to Part Name
		System.out.println("\nA map of part # to part name:\n");

		TreeMap<Integer,String> num2name = new TreeMap<Integer,String>();
		BufferedReader num2nameFile = new BufferedReader( new FileReader( "num2name.txt" ) );
		while (num2nameFile.ready())
		{
			// split the line into two tokens
			// conv first using Integer.parseInt()
			// put the two values into map
		}

		// print the map each entry on one line sep by TAB


		// - - - - - - - - - - - - - - - - - STEP #2: second map: Part # num to Quantity and a jopin of the two tables

		// read in and file that has part # to quantity on each line.  Use that info to fill a map of part # to part quantity
		// BUT print a table of part name to part quantity using the other map.
		// this is a join of the two tables keyed on part #

		TreeMap<Integer,Integer> num2quant = new TreeMap<Integer,Integer>();
		BufferedReader num2quantFile = new BufferedReader( new FileReader( "num2quant.txt" ) );
		while (num2quantFile.ready())
		{
			// split the line into two tokens
			// conv both using Integer.parseInt()
			// put the two values into map
		}
		System.out.println("\nA join of part # to name to quantity:\n");

		// use both maps to print a table where each line is part # then TAB then name then TAB then quantity. Sorted vertically by part #
		// print #, name and quantity sep by TABS


		// - - - - - - - - - - - - - - - - - STEP #3: Print a sorted inverse of the table you just printed above.

		System.out.println("\nA table of part quantity to part name, sorted by quantity:\n");

		// You are on your own here
		// may assume part names unique (but not quantities). Must match output exactly!
		// print the part numbers in 3 places. You may want to use String.format(). See API

		// your code here

	} // END MAIN

} // END CLASS