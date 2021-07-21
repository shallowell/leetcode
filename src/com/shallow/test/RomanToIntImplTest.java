import com.shallow.program.RomanToIntImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntImplTest {

	@Test
	public void testIII() {
		RomanToIntImpl impl = new RomanToIntImpl();
		Assertions.assertThat(impl.romanToInt("III")).isEqualTo(3);
	}

	@Test
	public void testIV() {
		RomanToIntImpl impl = new RomanToIntImpl();
		Assertions.assertThat(impl.romanToInt("IV")).isEqualTo(4);
	}

	@Test
	public void testIX() {
		RomanToIntImpl impl = new RomanToIntImpl();
		Assertions.assertThat(impl.romanToInt("IX")).isEqualTo(9);
	}
	@Test
	public void testLVIII() {
		RomanToIntImpl impl = new RomanToIntImpl();
		Assertions.assertThat(impl.romanToInt("LVIII")).isEqualTo(58);
	}
	@Test
	public void testMCMXCIV() {
		RomanToIntImpl impl = new RomanToIntImpl();
		Assertions.assertThat(impl.romanToInt("MCMXCIV")).isEqualTo(1994);
	}


}