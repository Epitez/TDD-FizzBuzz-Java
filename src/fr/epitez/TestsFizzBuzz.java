package fr.epitez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestsFizzBuzz {
	private FizzBuzz fizzBuzzUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		this.fizzBuzzUnderTest = new FizzBuzz();
	}
	
	@Test
	void testFizzBuzz() {
		assertEquals("", this.fizzBuzzUnderTest.toString(), "A la création, la valeur de FizzBuzz doit être vide");
	}

	@Test
	void testSetValue_1() {
		this.fizzBuzzUnderTest.setValue(1);
		assertEquals("1", this.fizzBuzzUnderTest.toString(), "La valeur 1 se transforme en \"1\"");
	}
}