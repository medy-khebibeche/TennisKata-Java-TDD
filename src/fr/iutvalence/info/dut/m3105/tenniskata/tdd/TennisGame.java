package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private String score;
	
	public TennisGame()
	{
		this.score = "love-all";
	}

	public void serverScoredOnePoint()
	{
		this.setScore("fifteen-love");
	}
	
	public void receiverScoredOnePoint()
	{
		this.setScore("love-fifteen");
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
