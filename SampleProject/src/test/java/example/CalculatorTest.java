package example;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
	@Test
	@DisplayName("文字列は数値判定されない")
	public void strCheck() {
		boolean result = Calculator.isNumeric("test");
		assertThat(result, is(false));
	}
	@Test
	@DisplayName("数値は数値判定される")
	public void intCheck() {
		boolean result = Calculator.isNumeric("7");
		assertThat(result, is(true));
	}
	
	@Test
	@DisplayName("文字列の入力値が正しいこと")
	public void strInputCheck() {
	    String input = "test";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("test", Calculator.getStrInput());
	}
	
	@Test
	@DisplayName("数値の合計値となること")
	public void testCalculate1() {
	    int num1 = 158;
	    String num2 = "242";
	    String result = Calculator.testCalculate(num1, num2);

	    assertThat(result, is("400"));
	}
	
	@Test
	@DisplayName("文字列連結されること")
	public void testCalculate2() {
	    int num1 = 177;
	    String num2 = "こんにちは";
	    String result = Calculator.testCalculate(num1, num2);

	    assertThat(result, is("177こんにちは"));
	}
}
