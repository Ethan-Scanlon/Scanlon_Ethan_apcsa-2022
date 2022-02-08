//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = -1;
		int evenIndex = -1;
	
		for(int i = 0; i<ray.length; i++) {
			if(ray[i] % 2 == 1) oddIndex = i;
		
			for(int j = oddIndex; j<ray.length; j++) {
				if(ray[j] % 2 ==0) evenIndex = j;
				
				if(oddIndex==i && evenIndex==j) {
					return evenIndex-oddIndex;
				}
				
			}
			
		}
		return -1;
	}
}