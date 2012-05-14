package com.fiveamsolutions.dojo.bowling;


public class BowlingGame {
	
    private int[] rolls = new int[20];
    private int rollNumber = 0;

	public int scoreGame() {
    	int score = 0;
    	for (Integer roll : rolls) {
    		score +=  roll;
    	}
        return score;
    }

	public void roll(int i) {
		rolls[rollNumber++] = i;
	}

    
}
