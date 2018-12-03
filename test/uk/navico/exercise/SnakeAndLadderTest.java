package uk.navico.exercise;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class SnakeAndLadderTest {

	@Test
	void snakesAndLaddersMainTest() throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(("Rashmi"
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n").getBytes());
		System.setIn(in);
		
		SnakeAndLadder.main(null);
		System.setIn(System.in);
	}
	
	@Test
	void snakesAndLaddersMainExitTest() throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream("Rashmi\nExit".getBytes());
		System.setIn(in);
		
		SnakeAndLadder.main(null);
		System.setIn(System.in);
	}
	
	@Test
	void snakesAndLaddersExceptionTest() {
		ByteArrayInputStream in = new ByteArrayInputStream("Rashmi \n ".getBytes());
		System.setIn(in);
		
		try {
			SnakeAndLadder.main(null);
			fail("Expected exception.");
		} catch (NullPointerException e) {
			assert(true);
		} catch (IOException e) {
			fail("Expected nullpointerexception.");
		}
		System.setIn(System.in);
	}

}
