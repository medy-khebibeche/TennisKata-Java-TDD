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
		assertEquals(testGame.getScore(),testGame.LOVE_ALL);
	}
	
	@Test
	public void serverScoreOnePointFirstTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.serverScoredOnePoint();
		assertEquals(testGame.getScore(),testGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void receiverScoreOnePointFirstTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.receiverScoredOnePoint();
		assertEquals(testGame.getScore(),testGame.LOVE_FIFTEEN);
	}
	
	@Test
	public void serverAndReceiverScoredOnePointTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.serverScoredOnePoint();
		testGame.receiverScoredOnePoint();
		assertEquals(testGame.getScore(), testGame.FIFTEEN_ALL);
	}
	
	@Test
	public void receiverAndServerScoredOnePointTest()
	{
		TennisGame testGame = new TennisGame();
		testGame.receiverScoredOnePoint();
		testGame.serverScoredOnePoint();
		assertEquals(testGame.getScore(), testGame.FIFTEEN_ALL);
	}
}
