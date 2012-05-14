package com.fiveamsolutions.dojo.bowling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        int score = game.scoreGame();
        assertEquals(0, score);
    }

    @Test
    public void allOnes() {
    	BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
    	int score = game.scoreGame();
    	assertEquals(20, score);
    }

    @Test
    public void oneSpare() {
    	BowlingGame game = new BowlingGame();
        game.roll(4);
    	game.roll(6);
    	game.roll(4);
    	for (int i = 3
    			; i < 20; i++) {
    		game.roll(0);
    	}
    	int score = game.scoreGame();
    	assertEquals(18, score);
    }
}
