import com.shallow.program.LengthOfLastWordImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

	String noSpaces = "Baseball";
	int answer_noSpaces = 8;

	String oneSpace = "Love Baseball";
	int answer_oneSpace = 8;

	String twoSpaces = "I Love Baseball";
	int answer_twoSpaces = 8;

	String onlyOneSpace = " ";
	int answer_onlyOneSpaces = 0;

	String onlySpaces = "    ";
	int answer_onlySpaces = 0;

	@Test
	public void testMain() {
		LengthOfLastWordImpl impl = new LengthOfLastWordImpl();
		Assertions.assertThat(impl.lengthOfLastWord(noSpaces)).isEqualTo(answer_noSpaces);
		Assertions.assertThat(impl.lengthOfLastWord(oneSpace)).isEqualTo(answer_oneSpace);
		Assertions.assertThat(impl.lengthOfLastWord(twoSpaces)).isEqualTo(answer_twoSpaces);
		Assertions.assertThat(impl.lengthOfLastWord(onlyOneSpace)).isEqualTo(answer_onlyOneSpaces);
		Assertions.assertThat(impl.lengthOfLastWord(onlySpaces)).isEqualTo(answer_onlySpaces);




	}

}