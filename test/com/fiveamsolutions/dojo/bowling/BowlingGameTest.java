package com.fiveamsolutions.dojo.bowling;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

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
}
