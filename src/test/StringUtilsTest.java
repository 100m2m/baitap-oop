package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.util.StringUtils;

class StringUtilsTest {
	
	@Test
	void stringIsNull() {
		assertTrue(StringUtils.isEmpty(null));
	}
	
	@Test
	void stringIsEmpty() {
		assertTrue(StringUtils.isEmpty(""));
	}
	
	@Test
	void stringIsBlank() {
		assertTrue(StringUtils.isEmpty("  "));
	}
	
	@Test
	void stringIsValid() {
		assertFalse(StringUtils.isEmpty("Test 123 #@!"));
	}
}
