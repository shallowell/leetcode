
import com.shallow.program.PalindromeNumberImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	@Test
	public void test121 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(121)).isEqualTo(true);
	}

	@Test
	public void testMinus121 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(-121)).isEqualTo(false);
	}

	@Test
	public void test10 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(10)).isEqualTo(false);
	}

	@Test
	public void testMinus101 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(-101)).isEqualTo(false);
	}

	@Test
	public void test1221 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(1221)).isEqualTo(true);
	}
	@Test
	public void test15555551 () {
		PalindromeNumberImpl impl = new PalindromeNumberImpl();
		Assertions.assertThat(impl.isPalindrome(15555551)).isEqualTo(true);
	}

}