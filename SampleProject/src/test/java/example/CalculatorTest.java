package example;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("ともに自然数")
	public void naturals() {
		int result = Calculator.absAdd(5, 6);
		assertThat(result, is(11));
	}
	
	@Test
	@DisplayName("1つが負の値")
	public void minusCheck() {
		int result = Calculator.absAdd(5, -6);
		assertThat(result, is(11));
	}

}
