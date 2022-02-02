//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int num) {
	   setNum(num);
   }
   
   public void setNum(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		int i =1;
		while(i <= number/2) {
			if(number % i ==0) {
				sum += i;
				i++;
			}
			else {
				i++;
			}
		}
		if(sum == number) return true;
		else return false;
	}

	//add a toString
	public String toString() { 
		
		if(isPerfect()==true) return number + " is perfect.";
		
		else return number + " is not perfect.";
				
	}
	
}