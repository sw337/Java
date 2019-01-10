
import java.io.*;
import java.util.*;
import java.util.InputMismatchException;

/*
	- requires you to try/catch recovery from a format mismatch error
*/
public class Exercise2
{
	public static void main( String args[] )
	{


		int a=0;
		Scanner kbd = new Scanner(System.in);



		while (true)
		{
				try
				{
					System.out.print("Enter a number between 1 and 100 ");
					a = Integer.parseInt(kbd.nextLine());
					if ((a<1)||(a>100))
					{
							throw new Exception(("\nYou must enter an input a number between 1 and 100!\n"));
					}
					else
					{
						break;
					}
				}
				catch(NumberFormatException e)
				{
						System.out.println("\nYou must enter an input a number between 1 and 100!\n");

				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}

		System.out.printf("You entered %d\n", a );

	} //END main
} //EOF
