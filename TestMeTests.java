package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void ascii_valueTest() {
		
		int ascii_a_value = 97;
		int ascii_value = testMe.asciiValue();
		
		assertTrue(ascii_value == ascii_a_value);
	}

	@Test
	public void additionTest() {
		double baseValue = 2.0;
		testMe.setValue(baseValue);
		double addition_expected = baseValue + baseValue;
		double addition_actual = testMe.addition();

		assertTrue(addition_actual == addition_expected);
	}

	@Test
	public void moduloTest() {
		double baseValue = 4.0;
		testMe.setValue(baseValue);
		double remainder = baseValue % (baseValue + 1);
		double modulo_given = testMe.modulo();

		assertTrue(remainder == modulo_given);
	}

}
