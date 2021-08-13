import com.shallow.program.LongestCommonPrefixImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
	@Test
	public void testNormal() {
		LongestCommonPrefixImpl impl = new LongestCommonPrefixImpl();
		Assertions.assertThat(impl.longestCommonPrefix(new String[] {"flower","flow","flight"})).isEqualTo("fl");
	}

	@Test
	public void testNoMatch() {
		LongestCommonPrefixImpl impl = new LongestCommonPrefixImpl();
		Assertions.assertThat(impl.longestCommonPrefix(new String[] {"dog","racecar","car"})).isEqualTo("");
	}

	@Test
	public void testPerfectMatch() {
		LongestCommonPrefixImpl impl = new LongestCommonPrefixImpl();
		Assertions.assertThat(impl.longestCommonPrefix(new String[] {"perfect","perfect","perfect"})).isEqualTo("perfect");
	}


}