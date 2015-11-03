package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	public static final String[] allScore = {"love","fifteen","thirty","all"};

	private String score;
	private int nbTimesServerScored;
	


	private int nbTimesReceiverScored;
	
	public TennisGame()
	{
		//this.score = LOVE_ALL;
		this.nbTimesReceiverScored = 0;
		this.nbTimesServerScored = 0;	
	}

	public void serverScoredOnePoint()
	{
		this.nbTimesServerScored++;
	}
	
	public void receiverScoredOnePoint()
	{
		this.nbTimesReceiverScored++;
	}
	
	public String getScore() 
	{
		String score ="";
		score = allScore[this.nbTimesServerScored]+"-"+allScore[this.nbTimesReceiverScored];
		return score;
	}
	
	public int getNbTimesServerScored() {
		return this.nbTimesServerScored;
	}
	
	public int getNbTimesReceiverScored() {
		return this.nbTimesReceiverScored;
	}


}
