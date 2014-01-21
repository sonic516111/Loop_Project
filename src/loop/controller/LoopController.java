package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

/**
 * Controller object for the loop project.
 * 
 * @author gsla6260
 * @version 1.0 11/5/13 added data members and start method.
 */
public class LoopController
{
	private LoopFrame appFrame;
	private Looper myLooper;
	private int clickCount;

	public LoopController()
	{
		this.myLooper = new Looper();
		clickCount = 0;
	}

	/**
	 * Starts theapplication
	 */
	public void start()
	{
		appFrame = new LoopFrame(this);
	}

	public String getLoopResults()
	{
		String currentResults = loopBackwardList();

		return currentResults;
	}

	private String loopOverList()
	{
		String loopedData = "";

		for (int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		return loopedData;
	}
	
	private String loopBackwardList()
	{
		String backLoopedData = "";
		
		for(int position = myLooper.getGraveNameList().size() -1; position >= 0; position--)
		{
			backLoopedData+= myLooper.getGraveNameList().get(position) + "\n";
		}
		return backLoopedData;
	}
	
	private String getText(int position)
	{
		String results = "";

		if (position > -1 && position < myLooper.getGraveNameList().size())
		{
			results = myLooper.getGraveNameList().get(position);
		}
		return results;
	}

}
