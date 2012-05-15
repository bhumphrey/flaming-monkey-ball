package com.fiveamsolutions.dojo.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

	private List<Integer> rolls = new ArrayList<Integer>();

	public int scoreGame() {
		int score = 0;
		int rollIndex = 0;
		int frameTotal;
		for (int frame = 0; frame < 10; frame++) {
			frameTotal = rolls.get(rollIndex) + rolls.get(rollIndex + 1);
			if (frameTotal >= 10) {
				score += rolls.get(rollIndex + 2);
			}
			
			if (isStrike(rollIndex)) {
				rollIndex++;
			} else {
				rollIndex += 2;
			}
			
			score  += frameTotal;
		}
		return score;
	}

	private boolean isStrike(int rollIndex) {
		return rolls.get(rollIndex) == 10;
	}

	public void roll(int i) {
		if (i >= 10) {
			i = 10;
		} else if (i < 0) {
			i = 0;
		}
		rolls.add(i);
	}

}
