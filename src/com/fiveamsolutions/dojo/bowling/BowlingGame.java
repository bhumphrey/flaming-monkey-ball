package com.fiveamsolutions.dojo.bowling;


public class BowlingGame {
	
    private int[] rolls = new int[20];
    private int rollNumber = 0;

	public int scoreGame() {
    	int score = 0;
    	for (int frame = 0; frame < 10; frame++) {
    		int total = rolls[2*frame] + rolls[(2*frame) +1];
    		score += total;
    		if ( total == 10) {
    			score += rolls[(2*frame) + 2];
    		}
    	}
        return score;
    }

	public void roll(int i) {
		rolls[rollNumber++] = i;
	}

    
}
