//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   
	int number = 0;
	Scanner keyboard = new Scanner(in);
	number = keyboard.nextInt();
	Triples test = new Triples(number);
	System.out.println(test);
	   
	   
	}
}