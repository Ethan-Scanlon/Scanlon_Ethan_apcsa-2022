import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Scanlon
//Date - 2/20/22

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(ray));
		
		ArrayList<Integer> ray2;
		ray2 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		System.out.println(ListSumFirst.go(ray2));
		
		ArrayList<Integer> ray3;
		ray3 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		System.out.println(ListSumFirst.go(ray3));
		
		ArrayList<Integer> ray4;
		ray4 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(ray4));
	}
}