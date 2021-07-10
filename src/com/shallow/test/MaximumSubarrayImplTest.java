import com.shallow.program.MaximumSubarrayImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MaximumSubarrayImplTest {


	private void setInputAndOutPut (HashMap<Integer,int[]> inOutMap) {

		inOutMap.put(6, new int[] {-2,1,-3,4,-1,2,1,-5,4});
		inOutMap.put(1, new int[] {1});
		inOutMap.put(23, new int[] {5,4,-1,7,8});
		inOutMap.put(-1, new int[] {-3,-2,-1});

	}


	@Test
	public void testMain () {
		MaximumSubarrayImpl impl = new MaximumSubarrayImpl();
		HashMap<Integer, int[]> inOutMap = new HashMap<Integer, int[]>();

		setInputAndOutPut(inOutMap);

		inOutMap.forEach((outputNum, intputArray) -> {
			Assertions.assertThat(impl.maxSubArray(intputArray)).isEqualTo(outputNum);
		});

	}


}