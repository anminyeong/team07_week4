package com.your.dream.web;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class DreamTest {

	@Test
	public void testComeTrue() {
		// given
		int ageToBeTrue = 42;
		boolean expected = false;
		
		// when
		Dream dream = new Dream(ageToBeTrue);
		boolean actual = dream.comeTrue();
		
		// then
		assertThat(actual, is(expected));
	}

}
