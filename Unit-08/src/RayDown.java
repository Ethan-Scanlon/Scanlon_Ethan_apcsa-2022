//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		boolean test = true;
		for(int i = 0; i<numArray.length-1; i++) {
			if(numArray[i]>numArray[i+1]) {
				test = true;
			}
			if(numArray[i]<=numArray[i+1]) {
				test = false;
			}
			if (test==false) {
				return false;
			}
		}
		return true;
	}	
}