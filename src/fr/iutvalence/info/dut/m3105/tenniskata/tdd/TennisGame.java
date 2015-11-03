package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_ALL = "fifteen-all";
	
	private String score;
	
	public TennisGame()
	{
		this.score = LOVE_ALL;
	}

	public void serverScoredOnePoint()
	{
		if (this.score == LOVE_FIFTEEN)
		{
			this.setScore(FIFTEEN_ALL);
		}else
		{
			this.setScore(FIFTEEN_LOVE);
		}
	
	}
	
	public void receiverScoredOnePoint()
	{
		if (this.score == FIFTEEN_LOVE)
		{
			this.setScore(FIFTEEN_ALL);
		}else
		{
			this.setScore(LOVE_FIFTEEN);
		}
		
	}
	
	public String getScore() 
	{
		return this.score;
	}
	
	public void setScore(String score) 
	{
		this.score = score;
	}

}
