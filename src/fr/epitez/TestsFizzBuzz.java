package fr.epitez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsFizzBuzz {

	@Test
	void testFizzBuzz() {
		FizzBuzz fizzBuzzUnderTest = new FizzBuzz();
		assertEquals("", fizzBuzzUnderTest.toString(), "A la création, la valeur de FizzBuzz doit être vide");
	}

}
