package uk.navico.exercise;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class DiceTest {

	@Test
	void diceRollTest() {
		int diceRoll = Dice.roll();
		if(diceRoll > 0 && diceRoll <= 6) {
			assert(true);
		}
		else {
			assert(false);
		}
	}

}
