import com.shallow.program.ValidParenthesesImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
	@Test
	public void testSingleBrackets() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("()")).isEqualTo(true);
	}

	@Test
	public void testMultiple() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("()[]{}")).isEqualTo(true);
	}

	@Test
	public void testNested() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("({[]})")).isEqualTo(true);
	}

	@Test
	public void testWrongSimple() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("(]")).isEqualTo(false);
	}

	@Test
	public void testWrongMultiple() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("(])]")).isEqualTo(false);
	}

	@Test
	public void testPartlyWrong() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("(){]")).isEqualTo(false);
	}

	@Test
	public void testWrongleftBracketOnly() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid("(")).isEqualTo(false);
	}
	@Test
	public void testWrongRightBracketOnly() {
		ValidParenthesesImpl impl = new ValidParenthesesImpl();
		Assertions.assertThat(impl.isValid(")")).isEqualTo(false);
	}

}