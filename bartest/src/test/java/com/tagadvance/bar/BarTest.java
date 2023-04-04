package com.tagadvance.bar;

import com.tagadvance.foo.TestUtility;
import org.junit.Test;

public class BarTest {

	@Test
	public void testThatFooTestIsAccessible() {
		TestUtility.doNothing();
	}

}
