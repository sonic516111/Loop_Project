package loop.model;

import java.util.ArrayList;

public class Looper
{
	
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}

	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	private void fillTheNameList()
	{
		graveNameList.add("Alice Augusta");
		graveNameList.add("Chris John Christensen");
		graveNameList.add("Lauretta V. Boe");
		graveNameList.add("Albert J. Murray");
		graveNameList.add("Harold V. Christensen");
		graveNameList.add("Amber K. Christensen");
		graveNameList.add("Roger K. Church");
		graveNameList.add("Ole Nelson");
		graveNameList.add("Hilda Nelson");
		graveNameList.add("Nels J. Nelson");
		graveNameList.add("Lawrence Keeler");
		graveNameList.add("Kenneth Gail Roberts");
		graveNameList.add("Teresa E. Bartlett");
		graveNameList.add("Chas. H. Buxton");
		graveNameList.add("Pearl G. Buxton");
		graveNameList.add("Arley Jay Johnson");
		graveNameList.add("Arvilla Kammar Johnson");
		graveNameList.add("Joan J. Fox");
		graveNameList.add("Peter M. Keesee");
	}
	public String loopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;
		
		for(int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}
		loopResult += "\nThe loop executed " + timesLooped + " times";
		
		return loopResult;
	}
	
	public String loopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
				{
					for (int outerLoop = 0; outerLoop < 60; outerLoop++)
					{
						for(int loopCounter = 0; loopCounter < 60; loopCounter++)
						{
//							loopResult += loopCounter + ", ";
							timesLooped++;
						}
					outerLoopTimes++;
					}
				}
		}	
		loopResult += "\nThe loop executed " + timesLooped + " times";
		
		return loopResult;
	}
	
	public String loopTestThree()
	{
		String loopResult = "";
		int timesLooped = 0;
		for(int pokemon = 0; pokemon < 721; pokemon++)
		{
			timesLooped++;
		}
		loopResult += "\nThere are " + timesLooped + " pokemon in the pokemon world";
		
		return loopResult;
	}
}
