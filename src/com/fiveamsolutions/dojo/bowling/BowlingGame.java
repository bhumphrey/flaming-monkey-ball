package com.fiveamsolutions.dojo.bowling;

import java.util.Collection;

public class BowlingGame {
	
    public int scoreGame(Collection<Integer> rolls) {
    	int score = 0;
    	for (Integer roll : rolls) {
    		score +=  roll;
    	}
        return score;
    }

    
}
