//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = 0;
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public String charToString() {
		return "" + lookFor;
	}

	public String removeLetters()
	{
//		String cleaned=sentence;//
//		
		String addition = "";
		
		for(int i=0; i < sentence.length(); i++) {
			if(!sentence.substring(i, i+1).equals(charToString())) {
				addition += sentence.substring(i, i+1);
			}
		}
		return addition;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	
	}
}