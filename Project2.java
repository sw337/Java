/* Project2.java  Dynamic histogram */

import java.io.*;
import java.util.*;

public class Project2
{
	static final int INITIAL_CAPACITY = 10;
	public static void main (String[] args) throws Exception
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Project2 <input filename>\n\n"); // i.e. C:\> java Project2 dictionary.txt
			System.exit(0);
		}
		int[] histogram = new int[0]; // histogram[i] == # of words of length n

		/* array of String to store the words from the dictionary.
			We use BufferedReader (not Scanner). With each word read in, examine it's length and update word length frequency histogram accordingly.
		*/

		String[] wordList = new String[INITIAL_CAPACITY];
		int wordCount = 0;
		BufferedReader infile = new BufferedReader( new FileReader(args[0]) );
		while ( infile.ready() )
		{
			String word = infile.readLine();
			// # # # # # DO NOT WRITE/MODIFY ANYTHING ABOVE THIS LINE # # # # #

			// test to see if list is full. If needed do an up size (just like Lab#3)
				upSizeArr(wordList);
				int max =29;

				if (histogram.length < max)
                {
                histogram =new int[max];
                }

				wordCount++;


			// now you may safely append word onto list and incr count

			// look at the word length and see if the histogram length is AT LEAST
			if (word.length() > max)
				max = word.length();
				upSizeHisto(histogram,max);
			// word length + 1. If not, you must upsize histogram to be EXACTLY word length + 1
			++histogram[word.length()];

			// now you can increment the counter in the histogram for this word's length

			//  # # # # # DO NOT WRITE/MODIFY ANYTHING BELOW THIS LINE  # # # # #
		} //END WHILE INFILE READY
		infile.close();

		wordList = trimArr( wordList, wordCount );
		System.out.println( "After final trim: wordList length: " + wordList.length + " wordCount: " + wordCount );

		// PRINT WORD LENGTH FREQ HISTOGRAM
		for ( int i = 0; i < histogram.length ; i++ )
			System.out.format("words of length %2d  %d\n", i,histogram[i] );

	} // END main

	// YOU MUST CORRECTLY COPY THE STRING REFS FROM THE OLD ARR TO THE NEW ARR
	static String[] upSizeArr( String[] fullArr )
	{
		String[] fullArr1 = new String[fullArr.length +1];

		return fullArr1; // just to make it complie you change as needed
	}
	static String[] trimArr( String[] oldArr, int count )
	{
		if (oldArr.length > count);
			String[] oldArr1 = new String[count];
		return oldArr1; // just to make it complie you change as needed
	}

	// YOU MUST CORRECTLY COPY THE COUNTS FROM OLD HISTO TO NEW HISTO
	static int[] upSizeHisto( int[] oldArr, int newLength )
	{
		int[] oldArr1 = new int[newLength];
		for (int i = 0; i < newLength; i++)
			{
			oldArr1[i] = oldArr1[i];
			}
		return oldArr; // just to make it complie you change as needed
	}
} // END CLASS PROJECT#2
