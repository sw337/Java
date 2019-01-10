import java.io.*;
import java.util.*;

public class Boggle
{
	static BufferedReader dictionaryReader;
	//static ArrayList<String> dictionary= new ArrayList<String>();
	static TreeSet<String> hits = new TreeSet<String>();
	static TreeSet<String> dictionary = new TreeSet<String>();


	public static void main(String[] args) throws Exception
	{
		int[] arrsize = new int[2];
		String[][] Board = loadBoard(args[1], arrsize);
		int col=arrsize[0], row = arrsize[1];
		int count =1;

		dictionaryReader = new BufferedReader(new FileReader(args[0]));

		while (dictionaryReader.ready())
			{
				dictionary.add(dictionaryReader.readLine());
			}
		//Collections.sort(dictionary);

		for (int i = 0; i < row; i++)
			{
				for(int j = 0; j< col; j++)
				{
					depthFirstSearch(Board, i, j, "");
				}
			}

		for (String word: hits)
			{
				System.out.println(word + " "+ count);
				count++;
			}
	}

	private static void depthFirstSearch(String[][] Board, int r, int c, String match)
	{
		match += Board[r][c];
		//int index = Collections.binarySearch(dictionary, match);
		String hold;


		if (match.length() > 2 && dictionary.contains(match))
			{
				hits.add(match);
			}
		 if (match.length() > Board.length*Board[r].length-1 && !dictionary.contains(match))
		{
			return;
		}

		if(r > 0 )
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r-1, c, match);
			Board[r][c] = hold;
		}

		if(r > 0 && c < Board[r].length-1 )
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r-1, c+1, match);
			Board[r][c] = hold;
		}

		if(c < Board[r].length-1)
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r, c+1, match);
			Board[r][c] = hold;
		}

		if(r < Board.length-1 && c < Board[r].length-1 )
		{
		hold=Board[r][c];
		Board[r][c] = "  ";
			depthFirstSearch(Board, r+1, c+1, match);
			Board[r][c] = hold;
		}

		if(r < Board.length-1)
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r+1, c, match);
			Board[r][c] = hold;
		}

		if(r < Board.length-1 && c > 0 )
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r+1, c-1, match);
			Board[r][c] = hold;
		}

		if(c > 0)
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r, c-1, match);
			Board[r][c] = hold;
		}

		if(r > 0 && c > 0)
		{
			hold=Board[r][c];
			Board[r][c] = "  ";
			depthFirstSearch(Board, r-1, c-1, match);
			Board[r][c] = hold;
		}
		return;
	}

	private static String[][] loadBoard(String infileName, int[] arrsize) throws Exception
	{
		Scanner infile = new Scanner(new File(infileName));
		int rows=infile.nextInt();
		int cols = rows;
		arrsize[0]=rows;  arrsize[1]=cols;
		String[][] Board = new String[rows][cols];
		for(int r = 0; r < rows ; r++)
			for(int c = 0; c < cols; c++)
				Board[r][c] = infile.next();

		infile.close();
		return Board;
	}
}
