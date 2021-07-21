import com.shallow.program.BinarianImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarianImplTest {
	@Test
	public void binarianTest1() {
		BinarianImpl impl = new BinarianImpl();
		Assertions.assertThat(impl.binarian(new int[] {1,0,2,0,0,2})).isEqualTo(3);
	}

	@Test
	public void binarianTest2() {
		BinarianImpl impl = new BinarianImpl();
		Assertions.assertThat(impl.binarian(new int[] {2,1,0,1})).isEqualTo(2);
	}
	@Test
	public void binarianTest3() {
		BinarianImpl impl = new BinarianImpl();
		Assertions.assertThat(impl.binarian(new int[] {2,2,2,2})).isEqualTo(1);
	}

	@Test
	public void binarianTest4() {
		BinarianImpl impl = new BinarianImpl();
		Assertions.assertThat(impl.binarian(new int[] {3,3,3,3})).isEqualTo(1);
	}


}