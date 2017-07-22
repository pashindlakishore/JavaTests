package com.qa;

public class ScoreCard {
	int [] scores = {1,3,10,20,30,300};
	
	public void displayScore()
	{
		System.out.println("Data ");
		for(int i : scores)
		{
		    
		    System.out.println("Next Item "+ i);
		}
	}

}
