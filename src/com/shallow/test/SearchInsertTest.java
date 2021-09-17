import static org.assertj.core.api.Assertions.assertThat;

import com.shallow.program.SearchInsertImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SearchInsertTest {
	static SearchInsertImpl impl;

	@BeforeAll
	public static void setup() {
		impl = new SearchInsertImpl();
	}

	@Test
	public void thirdIndexHit() {
		assertThat(impl.searchInsert(new int[]{1,3,5,6}, 5)).isEqualTo(2);
	}

	@Test
	public void thirdIndexNotHit() {
		assertThat(impl.searchInsert(new int[]{1,3,5,6}, 4)).isEqualTo(2);
	}

	@Test
	public void lastIndexNotHit() {
		assertThat(impl.searchInsert(new int[]{1,3,5,6}, 7)).isEqualTo(4);
	}

	@Test
	public void firstIndexNotHit() {
		assertThat(impl.searchInsert(new int[]{1,3,5,6}, 0)).isEqualTo(0);
	}

	@Test
	public void oneItemNotHit() {
		assertThat(impl.searchInsert(new int[]{1}, 0)).isEqualTo(0);
	}

	@Test
	public void numIsMinusNotHit() {
		assertThat(impl.searchInsert(new int[]{-5,-3,1,5}, -2)).isEqualTo(2);
	}
}