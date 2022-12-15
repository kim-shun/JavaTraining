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
	
//	@Test
//	@DisplayName("文字列の入力値が正しいこと")
//	public void strInputCheck() {
//	    String input = "test";
//	    InputStream in = new ByteArrayInputStream(input.getBytes());
//	    System.setIn(in);
//
//	    assertEquals("test", Calculator.getStrInput());
//	}
//	
//	@Test
//	@DisplayName("文字列は数値判定されない")
//	public void numericCheck() {
//		boolean result = Calculator.isNumeric("test");
//		assertEquals(result, is("false"));
//	}
}
