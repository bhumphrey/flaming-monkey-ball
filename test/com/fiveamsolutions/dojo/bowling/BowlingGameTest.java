package com.fiveamsolutions.dojo.bowling;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void testScoreGame() {
        BowlingGame game = new BowlingGame();
        Collection<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            rolls.add(0);
        }
        int score = game.scoreGame(rolls);
        assertEquals(0, score);
    }

    @Test
    public void allOnes() {
    	BowlingGame game = new BowlingGame();
        Collection<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            rolls.add(1);
        }
    	int score = game.scoreGame(rolls);
    	assertEquals(20, score);
    }

    @Test
    public void oneSpare() {
    	BowlingGame game = new BowlingGame();
        List<Integer> rolls = new ArrayList<Integer>();
    	rolls.add(4);
    	rolls.add(6);
    	for (int i = 2; i < 20; i++) {
    		rolls.add(0);
    	}
    	int score = game.scoreGame(rolls);
    	assertEquals(20, score);
    }
}
