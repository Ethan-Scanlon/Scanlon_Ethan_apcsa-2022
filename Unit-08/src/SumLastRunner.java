//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{	
		
		int[] ray = {-99,1,2,3,4,5,6,7,8,9,10,5};
		int[] ray2 = {9,10,-8,10000,-5000,-3000};
		RaySumLast test = new RaySumLast();
		System.out.println(test.go(ray));
		System.out.println(test.go(ray2));
	}
}