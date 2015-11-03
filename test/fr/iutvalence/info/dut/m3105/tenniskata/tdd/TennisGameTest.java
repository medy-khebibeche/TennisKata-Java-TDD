package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void startOfTheGameTest()
	{
		TennisGame testGame = new TennisGame();
		assertEquals(testGame.getScore(),"love-all");
	}
	
	@Test
	public void serverScoreOnePointFirstTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.serverScoredOnePoint();
		assertEquals(testGame.getScore(),"fifteen-love");
	}
	
	@Test
	public void receiverScoreOnePointFirstTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.receiverScoredOnePoint();
		assertEquals(testGame.getScore(),"love-fifteen");
	}
}
