//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		
		System.out.println("Enter a string: ");
		String s = keyboard.next();
		
		System.out.println("Enter the character that you want to delete from the previous string: ");
		char a = keyboard.next().charAt(0);
		
		LetterRemover test = new LetterRemover(s, a);
		System.out.println(test);
		
		
		
		//add test cases		
											
	}
}