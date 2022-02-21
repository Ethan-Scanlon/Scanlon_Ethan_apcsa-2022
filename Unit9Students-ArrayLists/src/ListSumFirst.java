//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Scanlon
//Date - 2/20/22

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for(int i = 1; i < ray.size(); i++) {
			if(ray.get(0) < ray.get(i)) {
				sum += ray.get(i);
			}
		}
		if(sum > 0) {
			return (int)sum;
		}
	
	
	return -1;
	}
}