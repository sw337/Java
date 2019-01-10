// F16 CS 401 Speeding Ticket Project
// Project1.java Starter File

// Justin McCoy
import java.io.*;
import java.util.*;

public class Project1
{
	public static void main (String args[])
	{
		// Create a scanner to read from keyboard
		Scanner kbd = new Scanner (System.in);

		String firstName="N/A",lastName="N/A";
		int age=0, speedLimit=0, actualSpeed=0, mphOverLimit=0;
		int baseFine=0, underAgeFine=0, zoneFine=0, totalFine=0;
		// DO NOT ADD TO OR MODIFY ABOVE THIS LINE



		// your variables & code in here
		//String[] input = new String[1]; // numbner of strings to be input per lin
		System.out.print("Enter your first name and last name: ");
		//input = kbd.nextLine().split(" ");// get the input of lines
		//firstName = input[0]; // first line is firs name
		//lastName = input[1]; // second line is last name
		firstName = kbd.nextLine();
		lastName = kbd.nextLine();


		System.out.print("Your age: "); // get the age
		age = kbd.nextInt();



		System.out.print("The speed limit: ");
		 speedLimit = kbd.nextInt(); // find the speed limit

		System.out.print("Your actual Speed: ");
		actualSpeed = kbd.nextInt(); // see what the speed is

		mphOverLimit = actualSpeed - speedLimit; //detrimes the miles per hour you were driving

		if ((age <21)&&(mphOverLimit>20)) // makes sure to only charge underage fine when you are speeding
		underAgeFine = 300;

		if ((mphOverLimit >= 5) && (mphOverLimit<=20)) // charges $30 for every 5 miles above the speed below 20
		baseFine = (mphOverLimit/5) * 30;

		if (mphOverLimit>20) // charges additional money if the speed was above 20
		baseFine = (mphOverLimit/5) * 50;



		System.out.print("Did it happen in a contrstuction zone(true/false)");
		boolean contrstuction = kbd.nextBoolean(); // creates a bool to see if you were in a construction zone

		if (contrstuction)
		zoneFine = baseFine;// adds the equivilent of the base fine to double the fine

		totalFine = zoneFine + baseFine + underAgeFine; // makes sure to add up all the fines

		// DO NOT ADD TO OR MODIFY BELOW THIS LINE
		System.out.println();
		System.out.format( "name: %s, %s\n",lastName,firstName );
		System.out.format( "age: %d yrs.\n",age );
		System.out.format( "actual speed: %d mph.\n",actualSpeed );
		System.out.format( "speed limit: %d mph.\n",speedLimit );
		System.out.format( "mph over limit: %d mph.\n",mphOverLimit );
		System.out.format( "base fine: $%d\n",baseFine );
		System.out.format( "zone fine: $%d\n",zoneFine );
		System.out.format( "under age fine: $%d\n",underAgeFine );
		System.out.format( "total fine: $%d\n",totalFine );
	} // END MAIN
} // END PROJECT1 CLASS
