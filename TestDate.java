import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestDate {
    @Parameter
    public int input1;

    @Parameterized.Parameters
    public static final List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0 }, { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 }, { 7 }, { 8 }, { 9 }, { 10 }
        });
    }

    @Test
    public void test() {
        equals(input1);
    }
}
