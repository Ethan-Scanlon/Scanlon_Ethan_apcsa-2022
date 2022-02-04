//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int temp = (int) Math.ceil(3*Math.random());
		 if(temp==0) compChoice = "R";
		 if(temp==1) compChoice = "P";
		 if (temp==2) compChoice = "S";
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice == "R" && compChoice == "P") winner = "computer";
		if(playChoice == "P" && compChoice == "S") winner = "computer";
		if(playChoice == "S" && compChoice =="R") winner = "computer";
		if((playChoice =="R" && compChoice =="R") || (playChoice=="P"&&compChoice=="P") || (playChoice=="S"&&compChoice=="S"))
				winner="draw";
		if(playChoice=="R"&&compChoice=="S") winner="player";
		if(playChoice=="P"&& compChoice == "R") winner="player";
		if(playChoice=="S"&&compChoice=="P")winner="player";
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had "+ compChoice
				+ "\n" + determineWinner() + "wins!";
		return output;
	}
}