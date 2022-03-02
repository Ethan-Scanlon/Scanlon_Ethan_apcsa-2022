//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if(spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		Dog old = null;
		int age = 0;
		int index = 0;
		for(int i = 0; i < pups.length; i++) {
			if(pups[i].getAge() > age) {
				age = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		Dog old = null;
		int age = 0;
		int index = 0;
		for(int i = 0; i < pups.length; i++) {
			if(pups[i].getAge() < age) {
				age = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}