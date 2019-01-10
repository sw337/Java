import java.util.*;
import java.io.*;

public class Lab4
{
	public static void main(String[] args, String ars[]) throws Exception
    {
			if (args.length < 1 )
			{
				System.out.println("ERROR: Must enter an int on cmd line (i.e. # of random ints to put in array)\n");
				System.exit(0);
			}

			BufferedReader inFile = new BufferedReader(new FileReader(args[0]));
			BufferedReader inFile2 = new BufferedReader(new FileReader(ars[0]));

			ArrayList<String> words =new ArrayList<String>();
			ArrayList<String> words2 =new ArrayList<String>();

			while(inFile.ready()){
				words.add( inFile.readLine());
	 }
	 while(inFile2.ready()){
		 words2.add( inFile2.readLine());
	}

	 		while(inFile.ready()){
				words.add( inFile.readLine());
	 }
	  Collections.sort(words);
	 for (String word : words ) // if you dont put words on the cmd line this loop skips over
	 System.out.println( word + "" + canonical( word ) );
 }


	static String canonical(String word)
	{
		char[] letters = word.toCharArray();
		Arrays.sort( letters );
		return new String( letters );
	}
}
