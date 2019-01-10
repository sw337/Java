import java.util.*;
import java.io.*;

/*
	Exercise1.java

	- requires you to write a try catch to handle a checked exception

		* REMOVE throws Exception then recompile and let the compiler tell you which exception(s) need handled
		* put the exception code in a try block
		* write the handler code in the catch block - your catch should prompt the user for the input file name
		 then re-intitialise the scanner using the new file name.
*/


public class Exercise1
{
	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1)
		{
			System.out.println("\nYou must enter an input filename on cmd line!\n");
			System.exit(0);
		}

		String infileName = args[0];

		while (true)
		{
				try
				{
					Scanner reader = new Scanner(new File(infileName));
					break;
				}
				catch(FileNotFoundException e)
				{
					System.out.println("\nYou must enter an input the correct filename!\n");
					Scanner read = new Scanner(System.in);
					String hold = read.nextLine();
				 	infileName = hold;
				}
		}


		Scanner infile = new  Scanner ( new File(infileName) );

		int tokenCnt=0;
		while (infile.hasNext())
		{
			String token = infile.next(); // read a string from infile
			System.out.printf("%d: %s\n", tokenCnt++, token);
		}
	}
} //End class
