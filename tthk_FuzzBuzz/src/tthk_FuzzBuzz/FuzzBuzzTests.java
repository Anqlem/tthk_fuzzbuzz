package tthk_FuzzBuzz;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTests {

	public void should100() {
        assertEquals(FuzzBuzz.of(0), ("0"));
    }
	

    public void multipleOfThreeReturnFizz(){
        assertEquals(FuzzBuzz.of(3), ("Fizz"));
    }

}
