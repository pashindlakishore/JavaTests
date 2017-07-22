package com.qa;

public class ScoreCard {
	int [] scores = {10,20,30};
	
	public void displayScore()
	{
		System.out.println("Data ");
		for(int i = 0; i<scores.length; i++)
		{
		    
		    System.out.println("Item "+scores[i]);
		}
	}

}
