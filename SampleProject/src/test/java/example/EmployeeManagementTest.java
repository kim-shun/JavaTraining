package example;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeManagementTest {

	@Test
	@DisplayName("社員番号取得")
	public void getNum() {
		Employee employee = new Employee(3,"tanaka");
		int result = employee.getNum();

		assertThat(result, is(3));
	}

	@Test
	@DisplayName("社員名取得")
	public void getName() {
		Employee employee = new Employee(3,"tanaka");
		String result = employee.getName();

		assertThat(result, is("tanaka"));
	}

	@Test
	@DisplayName("社員番号変更")
	public void changeNum() {
		Employee employee = new Employee(3,"tanaka");
		employee.changeNum(67);
		int result = employee.getNum();

		assertThat(result, is(67));
	}

	@Test
	@DisplayName("社員名変更")
	public void changeName() {
		Employee employee = new Employee(3,"tanaka");
		employee.changeName("iwahashi");
		String result = employee.getName();

		assertThat(result, is("iwahashi"));
	}

}
