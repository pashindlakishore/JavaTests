package com.qa;

public class ScoreCard {
	int [] scores = {1,3,10,20,30,300};
	
	public void displayScore()
	{
		System.out.println("Data ");

		int sum = 0;
		

		for(int i : scores)

		{

		    System.out.println("Item "+scores[i]);
		    sum += scores[i];
	    System.out.println("Next Item "+ i);

		}
		
		System.out.println("Sum is "+sum);
	}

}
