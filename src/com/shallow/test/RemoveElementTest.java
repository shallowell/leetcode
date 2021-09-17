import static org.assertj.core.api.Assertions.assertThat;

import com.shallow.program.RemoveElementImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class RemoveElementTest {
	static RemoveElementImpl impl;
	@BeforeAll
	public static void setUp() {
		impl = new RemoveElementImpl();
	}

	@Test
	public void testRemove1Element() {
		assertThat(impl.removeElement(new int[]{1,2,2}, 1)).isEqualTo(new int[]{2,2}.length);
	}

	@Test
	public void testRemove2Element() {
		assertThat(impl.removeElement(new int[]{1,2,2}, 2)).isEqualTo(new int[]{1}.length);
	}

	@Test
	public void testRemoveAllElement() {
		assertThat(impl.removeElement(new int[]{2,2,2}, 2)).isEqualTo(new int[]{}.length);
	}

	@Test
	public void testRemoveNoElement() {
		assertThat(impl.removeElement(new int[]{1,2,3}, 4)).isEqualTo(new int[]{1,2,3}.length);
	}



}