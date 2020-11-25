package fr.epitez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestsFizzBuzz {
	private FizzBuzz fizzBuzzUnderTest;
	
	@Test
	void testFizzBuzz() {
		this.fizzBuzzUnderTest = new FizzBuzz();
		assertEquals("", this.fizzBuzzUnderTest.toString(), "A la création, la valeur de FizzBuzz doit être vide");
	}

	@Test
	void testSetValue() {
		this.fizzBuzzUnderTest = new FizzBuzz();
		this.fizzBuzzUnderTest.setValue(1);
		assertEquals("1", this.fizzBuzzUnderTest.toString(), "A la création, la valeur de FizzBuzz doit être vide");
	}
	
}
