//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   
	   
	   WordsCompare test = new WordsCompare("abe", "ape");
	   test.compare();
	   System.out.println(test);

	   WordsCompare test2 = new WordsCompare("giraffe", "gorilla");
	   test2.compare();
	   System.out.println(test2);
	   
	   WordsCompare test3 = new WordsCompare("one", "two");
	   test3.compare();
	   System.out.println(test3);
	   
	   WordsCompare test4 = new WordsCompare("fun", "funny");
	   test4.compare();
	   System.out.println(test4);
	   
	   WordsCompare test5 = new WordsCompare("123", "19");
	   test5.compare();
	   System.out.println(test5);
	   
	   WordsCompare test6 = new WordsCompare("193", "1910");
	   test6.compare();
	   System.out.println(test6);
	   
	   WordsCompare test7 = new WordsCompare("goofy", "godfather");
	   test7.compare();
	   System.out.println(test7);
	   
	   WordsCompare test8 = new WordsCompare("funnel", "fun");
	   test8.compare();
	   System.out.println(test8);
	}
}