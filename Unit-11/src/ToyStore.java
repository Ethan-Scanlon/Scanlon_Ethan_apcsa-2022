//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys ) {
		int count = 0;
		String[] check = toys.split(" ", 0);
		for(int i=0; i<check.length; i++) {
			count = 0;
			Toy newToy = new Toy(check[i]);
			for(int j=i; j<check.length; j++) {
				if(check[i].compareTo(check[j]) == 0) {
					count++;
				}
			}
		newToy.setCount(count);
		toyList.add(i, newToy);
	}
		for(int i=1; i<toyList.size(); i++) {
			for(int j=i-1; j>-1; j--) {
				if(toyList.get(i).getName().compareTo(toyList.get(j).getName()) == 0) {
					toyList.remove(i);
					i--;
				}
			}
		}
	}
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy : toyList) {
  			if(toy.getName().compareTo(nm) == 0) {
  				return toy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
//  		String freq = toyList.get(0).getName();
//	  		for(int i=0; i<toyList.size()-1; i++) {
//	  			if((int)toyList.get(i).getCount() < (int)toyList.get(i+1).getCount()) {
//	  				freq=toyList.get(i+1).getName();
//	  			}
//	  		}
  		return "max == " + toyList.get(toyList.size()-1);
  	}  
  
  	public void sortToysByCount()
  	{
  	
  		for(int k=0; k<toyList.size(); k++) {
	  		for(int i=0; i<toyList.size()-1; i++) {
	  			if(toyList.get(i).getCount()>toyList.get(i+1).getCount()) {
	  				Toy z = toyList.get(i);
	  				toyList.set(i, toyList.get(i+1));
	  				toyList.set(i+1, z);
	  			}
	  		}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}