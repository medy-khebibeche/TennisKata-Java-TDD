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
	
}
