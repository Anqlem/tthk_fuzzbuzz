package tthk_FuzzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnOneHundredNumbers() {
		FuzzBuzz fb=new FuzzBuzz();
		assertEquals(100, fb.getNumbers().length);
	}

}
