import com.shallow.program.ReverseIntegerImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerImplTest {
    @Test
    public void testMain() {
        ReverseIntegerImpl impl = new ReverseIntegerImpl();
        test123(impl);
        Assertions.assertThat(impl.reverse1(-123)).isEqualTo(-321);
        Assertions.assertThat(impl.reverse1(120)).isEqualTo(21);
        Assertions.assertThat(impl.reverse1(0)).isEqualTo(0);
        Assertions.assertThat(impl.reverse1(1534236469)).isEqualTo(0);
        Assertions.assertThat(impl.reverse1(-1534236469)).isEqualTo(0);
        Assertions.assertThat(impl.reverse1(2147483647)).isEqualTo(0);
        Assertions.assertThat(impl.reverse1(-2147483648)).isEqualTo(0);
    }
    @Test
    public void test123(ReverseIntegerImpl impl) {
        Assertions.assertThat(impl.reverse1(123)).isEqualTo(321);

    }



}